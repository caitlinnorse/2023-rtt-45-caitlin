package com.teksystems.controller;

import com.teksystems.database.dao.InstrumentsDAO;
import com.teksystems.database.dao.UsersDAO;
import com.teksystems.database.entity.Instruments;
import com.teksystems.formbeans.UsersFormBean;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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

    @GetMapping("/register")
    public ModelAndView setup(HttpSession session) {
        log.debug("In the signup controller method");
        ModelAndView response = new ModelAndView("users/register");

        List<Instruments> instruments = instrumentsDAO.getAllInstruments();
        response.addObject("instruments", instruments);

        log.debug("Signup method in the controller is setting a value in the session");
        session.setAttribute("name", "signup set this value");

        return response;
    }
    @PostMapping("/register")
    public ModelAndView register(UsersFormBean form) {
        log.debug("In the register controller method");
        ModelAndView response = new ModelAndView("users/register");

        log.debug(form.toString());
        return response;
    }
}
