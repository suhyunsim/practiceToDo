package com.codesquad.practiceToDo.controller;

import com.codesquad.practiceToDo.domain.Card;
import com.codesquad.practiceToDo.domain.User;
import com.codesquad.practiceToDo.repository.CardRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Boolean.TRUE;

@RestController
public class TodoController {

    @Autowired
    CardRepository cardRepository;

    private static final Logger log = LoggerFactory.getLogger(TodoController.class);

    public TodoController() {

        User user = new User(1L, "poogle");

        Card cardFive = new Card(5L, "blabla", TRUE);
        List<Card> cards = new ArrayList<>();
        cards.add(cardFive);

    }
}
