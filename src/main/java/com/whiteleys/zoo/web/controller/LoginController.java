package com.whiteleys.zoo.web.controller;

import com.whiteleys.zoo.domain.User;
import com.whiteleys.zoo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindException;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * A form controller for handling the login form.
 */
@Controller
@RequestMapping("/login.*")
public class LoginController {

    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public String formBackingObject(Map model) throws Exception {
        model.put("userCommand",new User());
        return "login";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String submit(HttpServletRequest request, @ModelAttribute("userCommand") User command) throws Exception {

        User user = userService.getUser(command.getUsername(), command.getPassword());

        // put the user into the session to indicate logged in status
        request.getSession().setAttribute("user", user);

        return "redirect:/home.html";
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }


}