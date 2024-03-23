package com.alvaroblazmon.universe.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/galaxy")
public class GalaxyController {

    @GetMapping("/")
    public List<String> getGalaxies() {
        return List.of("Milky Way", "Andromeda", "Messier 87");
    }

}
