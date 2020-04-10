package com.codesquad.practiceToDo.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Card {

    @Id
    private Long id;
    private String contents;
    private ZonedDateTime createdTime;
    private ZonedDateTime modifiedTime;
    private Boolean status;
    private List<Activity> activities = new ArrayList<>();

//    private static String seoulTime() {
//        return ZonedDateTime.now(ZoneId.of("Asia/Seoul")).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
//    }

    public Card(Long id, String contents, Boolean status) {
        this.id = id;
        this.contents = contents;
//        this.createdTime = createdTime;
//        this.modifiedTime = modifiedTime;
        this.status = status;
    }
}
