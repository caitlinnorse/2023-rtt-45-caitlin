package springframework.controller;

import jakarta.validation.Valid;
import jakarta.websocket.server.PathParam;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import springframework.database.dao.EmployeeDAO;
import springframework.database.dao.OfficeDAO;
import springframework.database.entity.Employee;
import springframework.database.entity.Office;
import springframework.formbeans.EmployeeFormBean;
import org.springframework.validation.ObjectError;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Slf4j
@Controller
@RequestMapping("/employee")
@PreAuthorize("hasAuthority('ADMIN')")
public class EmployeeController {

    @Autowired
    private EmployeeDAO employeeDao;

    @Autowired
    private OfficeDAO officeDao;

    @GetMapping("/detail/{id}")
    public ModelAndView detail(@PathVariable Integer id) {
        ModelAndView response = new ModelAndView("employee/detail");

        log.debug("In employee detail controller method with id = " + id);
        Employee employee = employeeDao.findById(id);

        response.addObject("employee", employee);

        log.debug(employee + "");
        return response;
    }

    @GetMapping("/create")
    public ModelAndView create() {
        ModelAndView response = new ModelAndView("employee/create");
        log.debug("In employee controller - create employee");

        List<Office> offices = officeDao.getAllOffices();
        response.addObject("offices", offices);

        return response;
    }

    @GetMapping("/edit/{id}")
    public ModelAndView edit(@PathVariable Integer id) {
        ModelAndView response = new ModelAndView("employee/create");
        log.debug("In employee controller - edit employee");

        Employee emp = employeeDao.findById(id);
        EmployeeFormBean form = new EmployeeFormBean();

        // we are setting the employee id and all other employee fields on the form object
        // so that we can pass them to the jsp though the model
        form.setId(emp.getId());
        form.setEmail(emp.getEmail());
        form.setFirstName(emp.getFirstName());
        form.setLastName(emp.getLastName());
        form.setExtension(emp.getExtension());
        form.setJobTitle(emp.getJobTitle());
        form.setVacationHours(emp.getVacationHours());
        form.setOfficeId(emp.getOfficeId());
        form.setProfileImage(emp.getProfileImage());

        // add the form bean to the model to pass it to the jsp page
        response.addObject("form", form);

        List<Office> offices = officeDao.getAllOffices();
        response.addObject("offices", offices);

        return response;
    }

    @PostMapping("/createSubmit")
    public ModelAndView createSubmit(@Valid EmployeeFormBean form, BindingResult bindingResult) {
        ModelAndView response = new ModelAndView("employee/create");

        List<Office> offices = officeDao.getAllOffices();
        response.addObject("offices", offices);

        if ( bindingResult.hasErrors() ) {
            for ( FieldError error : bindingResult.getFieldErrors()) {
                log.debug("Validation Error on field : " + error.getField() + " with message : " + error.getDefaultMessage());
            }

            response.addObject("form", form);
            response.addObject("bindingResult", bindingResult);

            return response;
        }

        // if we get this far it means there were no errors in the incoming data

        log.debug("!!!!!!!!!!!!!!! In employee controller - create submit employee");
        log.debug(form.toString());

        // creating a new database entity
        // and populating it with the incoming data from the form
        Employee emp = new Employee();

        // if the id is populated in teh form bean then it is an edit, so we want to load the
        // employee from the database
        if ( form.getId() != null && form.getId() > 0) {
            emp = employeeDao.findById(form.getId());
        }

        // now we set all values from the form bean onto the employee object
        // !!! NOTE : we are not setting the id field here for 2 reasons
        // 1) If this is a create the database will auto generate the id
        // 2) If this is an edit we do not want to change the id (and it should be the same anyway)
        emp.setEmail(form.getEmail());
        emp.setFirstName(form.getFirstName());
        emp.setLastName(form.getLastName());
        emp.setExtension(form.getExtension());
        emp.setJobTitle(form.getJobTitle());
        emp.setVacationHours(form.getVacationHours());
        emp.setOfficeId(form.getOfficeId());
        emp.setProfileImage(form.getProfileImage());

        // in spring boot data there is only a single method called save that is used for both create and update
        employeeDao.save(emp);

        // now we add the populated form back to the model so when page can display itself again
        response.addObject("form", form);

        // now we add a boolean to the model so we can add a success message on the page
        response.addObject("success", true);

        // set the ID of the employee on the form bean so it triggers the page to be an edit
        // this is just to be nice to put the page into edit mode because if the ID is present in the form its considered an edit.
        form.setId(emp.getId());

        // instead of processing a JSP view we can also redirect to another page
        // response.setViewName("redirect:/employee/edit/" + emp.getId());

        return response;
    }


    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public ModelAndView employeeSearch(@RequestParam(required = false) String firstName, @RequestParam(required = false) String lastName) {
        log.debug("In the employee search controller method with firstName = " + firstName + " lastName = " + lastName);

        ModelAndView response = new ModelAndView("employee/search");

        // check if both firstName and lastName have a value
        if (StringUtils.isEmpty(firstName) && StringUtils.isEmpty(lastName)) {
            // if so run the qurey that works with both values
            log.debug("Both first name and last name are empty so use our special query");
            List<Map<String,Object>> employees = employeeDao.findAllWithOfficeName();
            response.addObject("employeesList", employees);


            // steam the lsit of employees and print them out
            employees.stream().forEach(emp -> {
                log.debug(emp.toString());
            });

            //print the employee first names uppercase
            employees.stream().forEach( emp -> {
                log.debug(emp.get("firstName").toString().toUpperCase());
            });
        }

        // check if both firstName and lastName have a value
        if (!StringUtils.isEmpty(firstName) && !StringUtils.isEmpty(lastName)) {
            // if so run the qurey that works with both values
            log.debug("Both first name and last name have a value");
            List<Employee> employees = employeeDao.findByFirstNameContainingOrLastNameContainingIgnoreCase(firstName, lastName);
            response.addObject("employeesList", employees);

        }

        // check if the first name is not empty and the last name is empty
        if (!StringUtils.isEmpty(firstName) && StringUtils.isEmpty(lastName)) {
            // we run our query that checks the fist name field only
            log.debug("First name has a value and last name is empty");
            List<Employee> employees = employeeDao.findByFirstNameContainingIgnoreCase(firstName);
            response.addObject("employeesList", employees);

        }

        // check if the first name is empty and the last name is not empty
        if (StringUtils.isEmpty(firstName) && !StringUtils.isEmpty(lastName)) {
            // we run our query that checks the last name field only
            log.debug("Last name has a value and first name is empty");
            List<Employee> employees = employeeDao.findByLastNameContainingIgnoreCase(lastName);
            response.addObject("employeesList", employees);

        }


        response.addObject("searchParamFirst", firstName);
        response.addObject("searchParamLast", lastName);

        return response;
    }

}