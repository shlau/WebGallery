package com.sheldon.gallery.web.Controller;

import com.sheldon.gallery.dao.UserRepository;
import com.sheldon.gallery.model.User;
import com.sheldon.gallery.service.EmailService;
import com.sheldon.gallery.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@ComponentScan(basePackages={"com.sheldon.gallery.config"})
public class RegisterController {
    private PasswordEncoder bCryptPasswordEncoder;
    private UserService userService;
    private EmailService emailService;


    @Autowired
    public RegisterController(PasswordEncoder bCryptPasswordEncoder, UserService userService, EmailService emailService) {
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
        this.userService = userService;
        this.emailService = emailService;
    }
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public ModelAndView register(ModelAndView modelAndView, User user) {
        modelAndView.addObject("user",user);
        modelAndView.setViewName("register");
        return modelAndView;
    }


}
