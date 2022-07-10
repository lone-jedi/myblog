package com.yarkin.myblog.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * TODO: add class / interface description
 *
 * @author OYarkin
 * @since 8.3.0
 */
@Controller
public class HomeController
{
    @RequestMapping("/")
    public String getHomePage() {
        return "index";
    }
}
