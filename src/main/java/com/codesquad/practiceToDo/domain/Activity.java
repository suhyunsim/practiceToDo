package com.codesquad.practiceToDo.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Activity {

    private Long id;
    private Action action;
    private Long startColumn;
    private Long endColumn;

    public Activity(Long id, Action action, Long startColumn, Long endColumn) {
        this.id = id;
        this.action = action;
        this.startColumn = startColumn;
        this.endColumn = endColumn;
    }
}
