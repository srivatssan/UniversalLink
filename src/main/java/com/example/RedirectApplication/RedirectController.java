package com.example.RedirectApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;
@Controller
@RequestMapping("/")
class RedirectController {

    private final Map<String, String> pathMappings = new HashMap<>();

    public RedirectController() {
        // Populate the map with sample path mappings
        pathMappings.put("example", "https://www.example.com");
        pathMappings.put("google", "https://www.google.com");
        pathMappings.put("duckie", "https://duckduckgo.com");
        // Add more mappings as needed
        System.out.println("Initialized map...");
    }

    @GetMapping("/{pathVariable}")
    public String redirect(@PathVariable String pathVariable) {
        // Check if the path variable is present in the mappings
    	System.out.println ("The path variable is : "+pathVariable);
        if (pathMappings.containsKey(pathVariable)) {
            // If yes, redirect to the corresponding URL
        	System.out.println ("Matching Key found...");
        	System.out.println("The value is :"+pathMappings.get(pathVariable));
        	return "redirect:" + pathMappings.get(pathVariable);
        } else {
            // If not, redirect to a default URL or display an error page
            return "redirect:/default";
        }
    }
}