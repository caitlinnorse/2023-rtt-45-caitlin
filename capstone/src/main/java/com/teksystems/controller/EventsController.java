package com.teksystems.controller;

import com.teksystems.database.dao.EventsDAO;
import com.teksystems.database.entity.Events;
import com.teksystems.formbeans.EventsFormBean;
import com.teksystems.formbeans.UsersFormBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/events")
public class EventsController {

    @Autowired
    private EventsDAO eventsDAO;

    @GetMapping("/detail/{id}")

    public ModelAndView detail(@PathVariable Integer id) {
        ModelAndView response = new ModelAndView("/events/detail");

        log.debug("In events detail controller method with id = " + id);
        Events event = eventsDAO.findById(id);

        response.addObject("events", event);

        log.debug(event + "");
        return response;
    }
    @GetMapping("/eventSignup")
    public ModelAndView eventSignup(EventsFormBean form) {
        ModelAndView response = new ModelAndView("events/eventSignup");

        log.debug("In events eventSignup controller method ");
        log.debug(form.toString());

        return response;
    }

    @RequestMapping(value = "/eventSearch", method = RequestMethod.GET)
    public ModelAndView eventSearch(@RequestParam(required = false) String search) {
        log.info("In event detail controller " + search);

        ModelAndView response = new ModelAndView("events/eventSearch");

        List<Events> eventsList = eventsDAO.findByEventNameContainingIgnoreCaseOrEventTypeContainingIgnoreCase(search, search);

        response.addObject("eventsList", eventsList);
        response.addObject("eventName", search);

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
