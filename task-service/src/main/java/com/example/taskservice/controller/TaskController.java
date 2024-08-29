package com.example.taskservice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @PostMapping
    public String submitTask(@RequestBody String task) {
        // Logic to submit task
        return "Task submitted";
    }

    @DeleteMapping("/{id}")
    public String removeTask(@PathVariable String id) {
        // Logic to remove task
        return "Task removed";
    }

    @GetMapping("/{id}")
    public String getTaskStatus(@PathVariable String id) {
        // Logic to get task status
        return "Task status";
    }
}
