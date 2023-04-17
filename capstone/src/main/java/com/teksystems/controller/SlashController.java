package com.teksystems.controller;

import com.teksystems.database.dao.EventsDAO;
import com.teksystems.database.entity.Events;
import com.teksystems.formbeans.UsersFormBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller
public class SlashController {

    @Autowired
    private EventsDAO eventsDAO;



    @RequestMapping(value = {"/home", "/", "/home.html"}, method = RequestMethod.GET)
    public ModelAndView index() {
        log.debug("In the home controller method");

        ModelAndView response = new ModelAndView("home");
        return response;
    }

    @PostMapping("/eventSignup")
    public ModelAndView eventSignup() {
        log.debug("In the eventSignup controller method");
        ModelAndView response = new ModelAndView("eventSignup");
        return response;
    }
    @PostMapping("/register")
    public ModelAndView register(UsersFormBean form) {
        log.debug("In the register controller method");
        ModelAndView response = new ModelAndView("users/register");

        log.debug(form.toString());
        return response;
    }

    @RequestMapping(value = "/calendar", method = RequestMethod.GET)
    public ModelAndView calendar() {
        log.debug("In the calendar controller method");
        ModelAndView response = new ModelAndView("calendar");
        return response;
    }

    @RequestMapping(value = "/thon", method = RequestMethod.GET)
    public ModelAndView thon() {
        log.debug("In the thon controller method");
        ModelAndView response = new ModelAndView("thon");
        return response;
    }

    @RequestMapping(value = "/basketballGames", method = RequestMethod.GET)
    public ModelAndView basketballGames() {
        log.debug("In the basketballGames controller method");
        ModelAndView response = new ModelAndView("basketballGames");
        return response;
    }


    @RequestMapping(value = "/footballGames", method = RequestMethod.GET)
    public ModelAndView footballGames() {
        log.debug("In the footballGames controller method");
        ModelAndView response = new ModelAndView("footballGames");
        return response;
    }


    @RequestMapping(value = "/fiveK", method = RequestMethod.GET)
    public ModelAndView fiveK() {
        log.debug("In the basketballGames controller method");
        ModelAndView response = new ModelAndView("fiveK");
        return response;
    }
}
