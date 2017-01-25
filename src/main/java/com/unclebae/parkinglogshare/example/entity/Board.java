package com.unclebae.parkinglogshare.example.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by KIDO on 2017. 1. 25..
 */
@Data
@Entity
@Table(name = "board")
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long boardno;

    @Column(name = "categoryno")
    private Long categoryNo;

    @Column
    private String title;

    @Column
    private String writer;

    @Column(name = "writerid")
    private String writerId;

    @Column(name = "votecount")
    private int voteCount;

    @Column(name = "readcount")
    private int readCount;

    @Column
    private LocalDateTime regdate;

    @Column
    private LocalDateTime moddate;

    private String contents;

}
