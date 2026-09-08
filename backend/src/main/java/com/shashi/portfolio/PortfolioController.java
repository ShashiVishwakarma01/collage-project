package com.shashi.portfolio;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/portfolio")
@CrossOrigin(origins = "*")
public class PortfolioController {

    @GetMapping
    public Map<String, Object> getPortfolio() {
        return Map.of(
                "name", "Shashi Vishwakarma",
                "roles", List.of("Coder", "Frontend developer", "Blogger", "Designer"),
                "services", List.of("Web development", "UI/UX Design", "Graphic Design", "SEO", "Video Editing", "Photography")
        );
    }
}
