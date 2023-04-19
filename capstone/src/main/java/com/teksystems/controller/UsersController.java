package com.teksystems.controller;

import com.teksystems.database.dao.InstrumentsDAO;
import com.teksystems.database.dao.UserRoleDAO;
import com.teksystems.database.dao.UsersDAO;
import com.teksystems.database.entity.Instruments;
import com.teksystems.database.entity.UserRole;
import com.teksystems.database.entity.Users;
import com.teksystems.formbeans.UsersFormBean;
import com.teksystems.security.AuthenticatedUserService;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/users")
public class UsersController {

    @Autowired
    UsersDAO usersDAO;

    @Autowired
    InstrumentsDAO instrumentsDAO;

    @Autowired
    UserRoleDAO userRoleDAO;

    @Autowired
    AuthenticatedUserService authenticatedUserService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/register")
    public ModelAndView setup() {
        log.debug("In the signup controller method");
        ModelAndView response = new ModelAndView("users/register");

        List<Instruments> instruments = instrumentsDAO.getAllInstruments();
        response.addObject("instruments", instruments);

        log.debug("Signup method in the controller is setting a value in the session");

        return response;
    }
    @PostMapping("/register")
    public ModelAndView register(@Valid UsersFormBean form, BindingResult bindingResult, HttpSession session) {
        log.debug("!!!!!!!!In the register controller method!!!!!!!!");
        ModelAndView response = new ModelAndView("users/register");

        List<Instruments> instruments = instrumentsDAO.getAllInstruments();
        response.addObject("instruments", instruments);

        response.addObject("form", form);

        if (StringUtils.equals(form.getPassword(), form.getConfirmPassword()) == false){
            bindingResult.rejectValue("confirmPassword", "error.confirmPassword", "Passwords do not match");
        }

        if(bindingResult.hasErrors()){
            for ( FieldError error : bindingResult.getFieldErrors()){
                log.debug("Validation Error on field: " + error.getField());

                log.debug("Validation Error Message: " + error.getDefaultMessage());
            }

            response.addObject("bindingResult", bindingResult);

            return response;
        }

        Users user = new Users();

        user.setEmail(form.getEmail());
        user.setFirstName(form.getFirstName());
        user.setLastName(form.getLastName());

        String encryptedPassword = passwordEncoder.encode(form.getPassword());

        user.setPassword(encryptedPassword);

        user.setMusicPart(form.getMusicPart());
        user.setBandYear(form.getBandYear());
        user.setInstrumentId(form.getInstrumentId());

        usersDAO.save(user);

        UserRole userRole = new UserRole();
        // we are going to hard code the default user role to be "USER"
        userRole.setRoleName("USER");
        // so when we go to set the user id FK on the user role entity the user id has been populated already.
        userRole.setUserId(user.getId());

        userRoleDAO.save(userRole);

        // very important that this line of code is after both the user and the user role is saved to the database
        // authenticate the user that was just created
        authenticatedUserService.changeLoggedInUsername(session, form.getEmail(), form.getPassword());


        log.debug(form.toString());
        return response;
    }
}
