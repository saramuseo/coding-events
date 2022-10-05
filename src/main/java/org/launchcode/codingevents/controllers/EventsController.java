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
import java.util.Map;

/**
 * Created by Chris Bay
 */
@Controller
@RequestMapping("events")
public class EventsController {

    //private static List<String> events = new ArrayList<>();

    @GetMapping
    public String displayAllEvents(Model model) {
        HashMap<String, String> events = new HashMap<>();
        events.put("Code Til Dawn", "coding event");
        events.put("XD Throwdown", "where design is a sport");
        events.put("STLX conference", "UI/UX focused conference");
        model.addAttribute("events", events);



//        List<String> events = new ArrayList<>();
//        events.add("Code With Pride");
//        events.add("Strange Loop");
//        events.add("Apple WWDC");
//        events.add("SpringOne Platform");
//        model.addAttribute("events", events);
        return "events/index";
    }

    //lives at /events/create
//    @GetMapping("create")
//    public String renderCreateEventForm() {
//        return "events/create";
//    }
//
//    @PostMapping ("create")
//    public String createEvent(@RequestParam String eventName) {
//        events.add(eventName);
//        return "redirect:";
//    }


}