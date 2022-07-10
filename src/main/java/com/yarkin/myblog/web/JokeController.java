package com.yarkin.myblog.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * TODO: add class / interface description
 *
 * @author OYarkin
 * @since 8.3.0
 */
@RestController
@RequestMapping(path = "/api/v1/jokes")
public class JokeController
{
    @GetMapping(path = "/one")
    public List<String> getJoke()
    {
        return List.of("Ha-ha-ha, no jokes for humans");
    }
}
