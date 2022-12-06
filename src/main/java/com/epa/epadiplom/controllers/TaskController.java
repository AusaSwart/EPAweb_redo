//package com.epa.epadiplom.controllers;
//
//import com.epa.epadiplom.repositories.TaskRepo;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//@Controller
//public class TaskController {
//    private final TaskRepo taskRepo;
//
//    public TaskController(TaskRepo taskRepo) {
//        this.taskRepo = taskRepo;
//    }
//
//    @RequestMapping("/tasks")
//    private String getTasks(Model model){
//        model.addAttribute("tasks", taskRepo.findAll());
//        return "tasks/list";
//    }
//}