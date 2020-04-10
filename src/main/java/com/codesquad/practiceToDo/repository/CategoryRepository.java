package com.codesquad.practiceToDo.repository;

import com.codesquad.practiceToDo.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
