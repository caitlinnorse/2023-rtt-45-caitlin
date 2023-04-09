package com.teksystems.controller;

import com.teksystems.database.dao.EventsDAO;
import com.teksystems.formbeans.UsersFormBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller
@RequestMapping("/events")
public class EventsController {

    @Autowired
    private EventsDAO eventsDAO;

    @GetMapping("/eventSignup")
    public ModelAndView create(UsersFormBean form) {
        ModelAndView response = new ModelAndView("events/eventSignup");

        log.debug("In events eventSignup controller method ");
        log.debug(form.toString());

        return response;
    }


}
