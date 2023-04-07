package com.teksystems.controller;

import com.teksystems.database.dao.UsersDAO;
import com.teksystems.database.entity.Users;
import com.teksystems.formbeans.UsersFormBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UsersDAO usersDAO;

    @GetMapping("/register")
    public ModelAndView create(UsersFormBean form) {
        ModelAndView response = new ModelAndView("users/register");

        log.debug("In users register controller method ");
        log.debug(form.toString());

        return response;
    }

    @PostMapping("/registerSubmit")
    public ModelAndView createSubmit(UsersFormBean form) {
        ModelAndView response = new ModelAndView("users/register");

        log.debug("!!!!!!!!!!!!!!!!!In users register submit controller method ");
        log.debug(form.toString());

        // creating a new database entity
        // and populating it with the incoming data from the form
        Users user = new Users();

        // if the id is populated in the form then it is an edit, so we want to load the
        // employee from the database
        if(form.getId() != null && form.getId() > 0) {
            user = usersDAO.findById(form.getId());
        }

        // now we set all values from the form bean onto the employee object
        // We are not setting the id field here for 2 reasons
        // 1) if this is a create the database will auto generate the id
        // 2) if this is an edit we do not want to change the id (should be the same anyway)
        user.setEmail(form.getEmail());
        user.setFirstName(form.getFirstName());
        user.setLastName(form.getLastName());
        user.setInstrument(form.getInstrument());
        user.setBandYear(form.getBandYear());
        user.setMusicPart(form.getMusicPart());
        user.setPassword(form.getPassword());
        user.setInstrumentId(form.getInstrumentId());

        // in spring boot data there is only a single method called save that is used for both create and update
        usersDAO.save(user);

        // now we add the populated form back to the model so page can display itself again

        response.addObject("form", form);

        // instead of processing a JSP view we can also redirect to another page
        // response.setViewName("redirect:/employee/edit/" + emp.getId());

        return response;

    }
}

