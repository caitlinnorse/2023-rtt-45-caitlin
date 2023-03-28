package springframework.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import springframework.database.dao.EmployeeDAO;
import springframework.database.entity.Employee;

import java.util.List;

@Slf4j
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeDAO employeeDAO;

    @RequestMapping(value="employee-search", method = RequestMethod.GET)
    public ModelAndView employeeSearch(@RequestParam(required = false) String search) {
        log.info("In the employee search controller method with search = " + search);
        ModelAndView response = new ModelAndView("employee/employee-search");

        //List<Employee> employees = employeeDAO.findByFirstNameContainingOrLastNameContainingIgnoreCase(search, search);
        List<Employee> employees = employeeDAO.usingJPAQuery(search, search);
        response.addObject("employeesList", employees);
        response.addObject("searchParam", search);
        return response;
    }
}
