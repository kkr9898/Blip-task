package com.example.task.service;

import org.springframework.stereotype.Service;

@Service
public class TaskService {
    public String solve(String input) {
        return input == null ? "" : input.trim(); // replace with real logic later
    }
}
