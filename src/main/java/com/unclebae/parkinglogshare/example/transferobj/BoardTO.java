package com.unclebae.parkinglogshare.example.transferobj;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Data;
import org.springframework.hateoas.ResourceSupport;

import java.time.LocalDateTime;

/**
 * Created by KIDO on 2017. 1. 25..
 */
@Data
public class BoardTO extends ResourceSupport {

    private Long boardno;

    private Long categoryNo;

    private String title;

    private String writer;

    private String writerId;

    private int voteCount;

    private int readCount;

    private LocalDateTime regdate;

    private LocalDateTime moddate;

    private String contents;
}
