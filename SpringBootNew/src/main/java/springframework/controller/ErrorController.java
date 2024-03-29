package springframework.controller;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Slf4j
@Controller
@ControllerAdvice
public class ErrorController {

    // !!!!! CHANGE THIS TO YOUR PACKAGE NAME
    private static final String PACKAGE_NAME = "springframework";


    @ExceptionHandler(Exception.class)
    public ModelAndView handleAllException(HttpServletRequest request, Exception ex) {
        String requestUrl = getRequestURL(request);
        log.warn("Error page exception happened on URL : " + requestUrl, ex);

        String htmlStackTrace = getHTMLStackTrace(ExceptionUtils.getStackFrames(ex));

        ModelAndView model = new ModelAndView("/error/500");

        String stackTrace = getHTMLStackTrace(ExceptionUtils.getStackFrames(ex));

        // message is the request URL if it was an error page, otherwise it can be a message
        // from the class that calls it
        model.addObject("requestUrl", requestUrl);
        model.addObject("message", ex.getMessage());
        model.addObject("stackTrace", stackTrace);

        if (ex.getCause() != null) {
            model.addObject("rootcause", ExceptionUtils.getRootCause(ex));

            String roottrace = getHTMLStackTrace(ExceptionUtils.getRootCauseStackTrace(ex));
            model.addObject("roottrace", roottrace);
        }

        return model;
    }

    private String getHTMLStackTrace(String[] stack) {
        StringBuffer result = new StringBuffer();
        for (String frame : stack) {
            if (frame.contains(PACKAGE_NAME)) {
                result.append(" &nbsp; &nbsp; &nbsp;" + frame.trim().substring(3) + "<br>\n");
            } else if (frame.contains("Caused by:")) {
                result.append("Caused By:<br>");
            }
        }

        return result.toString();
    }

    public String getRequestURL(HttpServletRequest request) {
        String result = request.getRequestURL().toString();
        if (request.getQueryString() != null) {
            result = result + "?" + request.getQueryString();
        }

        return result;
    }

}