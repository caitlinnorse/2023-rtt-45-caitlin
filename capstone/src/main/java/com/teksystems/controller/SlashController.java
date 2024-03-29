package com.teksystems.controller;

import com.teksystems.database.dao.EventsDAO;
import com.teksystems.database.dao.UserEventDAO;
import com.teksystems.database.dao.UsersDAO;
import com.teksystems.database.entity.Events;
import com.teksystems.database.entity.UserEvent;
import com.teksystems.database.entity.Users;
import com.teksystems.formbeans.UsersFormBean;
import com.teksystems.security.AuthenticatedUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Slf4j
@Controller
public class SlashController {

    @Autowired
    private EventsDAO eventsDAO;

    @Autowired
    private UserEventDAO userEventDAO;

    @Autowired
    private UsersDAO usersDAO;

    @Autowired
    private AuthenticatedUserService authenticatedUserService;

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

    @GetMapping("/detail/{id}")
    public ModelAndView detail(@PathVariable Integer id) {
        ModelAndView response = new ModelAndView("detail");

        log.debug("In events detail controller method with id = " + id);
        Events event = eventsDAO.findById(id);
        List<Map<String, Object>> userEventsList = eventsDAO.findUsersForEvent(event.getId());

        response.addObject("events", event);
        response.addObject("userEventsList", userEventsList);

        Boolean signedUp = false;

        Users user = authenticatedUserService.loadCurrentUser();

        if(user != null) {
            UserEvent ue = userEventDAO.findByEventIdAndUserId(id, user.getId());
            if(ue != null) {
                signedUp = true;
            }
        }

        response.addObject("signedUp", signedUp);


        log.debug(event + "");
        return response;
    }

    @RequestMapping(value = "/eventSearch", method = RequestMethod.GET)
    public ModelAndView eventSearch(@RequestParam(required = false) String search) {
        log.info("In event search controller " + search);

        ModelAndView response = new ModelAndView("eventSearch");

        List<Events> eventsList = eventsDAO.findByEventNameContainingIgnoreCaseOrEventTypeContainingIgnoreCase(search, search);


        response.addObject("eventsList", eventsList);
        response.addObject("eventName", search);

        return response;
    }

}
