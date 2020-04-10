package com.codesquad.practiceToDo.repository;

import com.codesquad.practiceToDo.domain.Project;
import org.springframework.data.repository.CrudRepository;

public interface ProjectRepository extends CrudRepository<Project, Integer> {
}
