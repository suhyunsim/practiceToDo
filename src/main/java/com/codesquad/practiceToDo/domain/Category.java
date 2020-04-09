package com.codesquad.practiceToDo.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Category {

    @Id
    private Long id;
    private String name;
    private boolean status;
    private Integer order;
    private List<Card> cards = new ArrayList<>();

    public Category(Long id, String name, boolean status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }
}
