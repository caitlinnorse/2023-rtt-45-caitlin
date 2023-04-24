package com.teksystems.controller;

import com.teksystems.database.dao.EventsDAO;
import com.teksystems.database.dao.UserEventDAO;
import com.teksystems.database.entity.Events;
import com.teksystems.database.entity.UserEvent;
import com.teksystems.database.entity.Users;
import com.teksystems.formbeans.EventsFormBean;
import com.teksystems.security.AuthenticatedUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;

@Slf4j
@Controller
@RequestMapping("/events")
public class EventsController {

    @Autowired
    private EventsDAO eventsDAO;

    @Autowired
    private AuthenticatedUserService authenticatedUserService;

    @Autowired
    private UserEventDAO userEventDAO;

    @GetMapping("/eventSignup")
    public ModelAndView eventSignup(@RequestParam Integer eventId) {
        ModelAndView response = new ModelAndView("redirect:/detail/" + eventId);

        log.debug("In events eventSignup controller method ");

        Events events = eventsDAO.findById(eventId);

        Users user = authenticatedUserService.loadCurrentUser();

        UserEvent userEvent = userEventDAO.findByEventIdAndUserId(events.getId(), user.getId());

        log.debug(userEvent + "");

        if(userEvent == null) {
            userEvent = new UserEvent();
            userEvent.setEventId(events.getId());
            userEvent.setUserId(user.getId());
            userEvent.setInstrumentId(1);

            userEventDAO.save(userEvent);
        }

        return response;
    }

    @GetMapping("/create")
    public ModelAndView create(EventsFormBean form) {
        ModelAndView response = new ModelAndView("events/create");

        log.debug("In events create controller method ");
        log.debug(form.toString());

        return response;
    }


    @PostMapping("/createSubmit")
    public ModelAndView createSubmit(EventsFormBean form) {
        ModelAndView response = new ModelAndView("events/create");

        log.debug("!!!!!!!!!!!!!!!!!In events create submit controller method ");
        log.debug(form.toString());



        Events event = new Events();

        if(form.getId() != null && form.getId() > 0) {
            event = eventsDAO.findById(form.getId());
        }

        event.setEventName(form.getEventName());
        event.setDate(form.getDate());
        event.setLocation(form.getLocation());
        event.setOtherEvents(form.getOtherEvents());
        event.setEventType(form.getEventType());

        eventsDAO.save(event);

        response.addObject("form", form);

        return response;

    }

    @GetMapping("/edit/{id}")
    public ModelAndView edit(@PathVariable Integer id) {
        ModelAndView response = new ModelAndView("events/create");

        Events event = eventsDAO.findById(id);
        EventsFormBean form = new EventsFormBean();

        form.setId(event.getId());
        form.setEventName(event.getEventName());
        form.setDate(event.getDate());
        form.setLocation(event.getLocation());
        form.setOtherEvents(event.getOtherEvents());
        form.setEventType(event.getEventType());


        response.addObject("form", form);


        log.debug("In events edit controller method ");

        return response;
    }


}
