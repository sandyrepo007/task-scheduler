package com.example.resourceservice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/resources")
public class ResourceController {

    @PostMapping
    public String allocateResource(@RequestBody String resourceRequest) {
        // Logic to allocate resources
        return "Resource allocated";
    }

    @DeleteMapping("/{id}")
    public String releaseResource(@PathVariable String id) {
        // Logic to release resources
        return "Resource released";
    }
}
