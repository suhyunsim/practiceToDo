package com.codesquad.practiceToDo.repository;

import com.codesquad.practiceToDo.domain.Card;
import org.springframework.data.repository.CrudRepository;

public interface CardRepository extends CrudRepository<Card, Long> {
}
