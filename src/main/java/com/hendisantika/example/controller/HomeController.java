package com.hendisantika.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-security-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 9/29/17
 * Time: 10:18 AM
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class HomeController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);

    @GetMapping("/")
    public String getHomePage() {
        LOGGER.debug("Getting home page");
        return "home";
    }

}
