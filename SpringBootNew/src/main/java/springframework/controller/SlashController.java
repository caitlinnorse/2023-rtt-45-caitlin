package springframework.controller;

import jakarta.servlet.http.HttpSession;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import springframework.database.dao.EmployeeDAO;
import springframework.database.dao.UserDAO;
import springframework.database.dao.UserRoleDAO;
import springframework.database.entity.User;
import springframework.database.entity.UserRole;
import springframework.formbeans.CreateUserFormBean;
@ToString
@Slf4j
@Controller
public class SlashController {

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRoleDAO userRoleDAO;


    @RequestMapping(value = {"/index", "/", "/index.html"}, method = RequestMethod.GET)
    public ModelAndView index() {



        log.debug("In the index controller method");

        log.trace("This is a trace log example");
        log.debug("This is a debug log example");
        log.info("This is an info log example");
        log.error("This is an error log example");
        log.warn("This is a warn log example");

        ModelAndView response = new ModelAndView("index");
        return response;
    }
    @GetMapping("/signup")
    public ModelAndView setup(HttpSession session) {
        log.debug("In the signup controller method");
        ModelAndView response = new ModelAndView("signup");

        log.debug("Signup method in the controller is setting a value in the session");
        session.setAttribute("name", "signup set this value");

        return response;
    }
    @PostMapping("/signup")
    public ModelAndView setup(CreateUserFormBean form) {

        ModelAndView response = new ModelAndView("signup");
        log.debug("In the signup controller post method");

        // first we create our user
        User user = new User();
        user.setEmail(form.getEmail());

        // this is needed by sprung security to encrupt passwords as the user is being created
        String encryptedPassword = passwordEncoder.encode(form.getPassword());
        user.setPassword(encryptedPassword);
        user.setFullName((form.getFullName()));

        // set out user - whenhibernate saves this user it will auto generate the ID
        // AND it will populate the field in the user entity
        user = userDAO.save(user);

        // create our user role
        UserRole userRole = new UserRole();
        userRole.setRoleName("USER");

        // so when we go to set the user id FK on the user role entity the user d has been populated already
        userRole.setUserId(user.getId());

        userRoleDAO.save(userRole);

        log.debug(form.toString());

        return response;
    }

    @RequestMapping(value = "/bootstrap", method = RequestMethod.GET)
    public ModelAndView bootstrap() {
        log.debug("In the bootstrap controller method");
        ModelAndView response = new ModelAndView("bootstrap");
        return response;
    }
}
