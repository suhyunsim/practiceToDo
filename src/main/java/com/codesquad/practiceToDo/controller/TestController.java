package com.codesquad.practiceToDo.controller;

import com.codesquad.practiceToDo.domain.Project;
import com.codesquad.practiceToDo.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/projects")
public class TestController {

    @Autowired
    private ProjectRepository repository;

    @GetMapping("/{id}")
    public ResponseEntity<Project> fetch(@PathVariable int id) {
        return ResponseEntity.ok(repository.findById(id).orElse(null));
    }
}
