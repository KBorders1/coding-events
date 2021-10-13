package org.launchcode.codingevents.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {

    private static HashMap<String, String> events = new HashMap<>();

    @GetMapping
    public String displayAllEvents(Model model) {
//        model.addAttribute("events", events);
//        return "events/index";
          events.put("Birthday Party", "It is my nephews 5th Birthday.");
          events.put("Christmas", "Lets exchange some gifts.");
          events.put("Halloween", "Too old to go trick or treating.");
          model.addAttribute("events", events);
          return "events/index";
    }
    // lives at /events/create
    @GetMapping("create")
    public String renderCreateEventForm() {
        return "events/create";
    }

    @PostMapping("create")
    public String createEvent(@RequestParam String eventName) {
        events.put(eventName, "No Description");
        return "redirect:";
    }

}
