package com.example.task.controller;

import com.example.task.domain.SolveRequest;
import com.example.task.domain.SolveResponse;
import com.example.task.service.TaskService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TaskController {
    private final TaskService service;
    public TaskController(TaskService service) { this.service = service; }

    @GetMapping("/ping")
    public String ping() { return "pong"; }

    @PostMapping("/solve")
    public SolveResponse solve(@RequestBody SolveRequest req) {
        return new SolveResponse(service.solve(req.input()));
    }
}
