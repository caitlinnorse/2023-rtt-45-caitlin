package com.teksystems.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller
public class SlashController {
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public ModelAndView home() {
        log.debug("In the home controller method");
        ModelAndView response = new ModelAndView("home");
        return response;
    }

    @RequestMapping(value = "/eventSignup", method = RequestMethod.GET)
    public ModelAndView eventSignup() {
        log.debug("In the eventSignup controller method");
        ModelAndView response = new ModelAndView("eventSignup");
        return response;
    }

    @RequestMapping(value = "/calendar", method = RequestMethod.GET)
    public ModelAndView calendar() {
        log.debug("In the calendar controller method");
        ModelAndView response = new ModelAndView("calendar");
        return response;
    }
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public ModelAndView register() {
        log.debug("In the register controller method");
        ModelAndView response = new ModelAndView("register");
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
