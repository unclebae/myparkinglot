package com.unclebae.parkinglogshare.example;

import com.unclebae.parkinglogshare.example.entity.Board;
import com.unclebae.parkinglogshare.example.enums.OrderType;
import com.unclebae.parkinglogshare.example.service.BoardService;
import com.unclebae.parkinglogshare.example.transferobj.BoardTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.ResourceSupport;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.List;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * Created by KIDO on 2017. 1. 25..
 */
@RestController
public class BoardController {

    @Autowired
    BoardService boardService;

    @RequestMapping("/board/all")
    public HttpEntity<List<BoardTO>> listAll(@RequestParam(value = "orderType", required = false, defaultValue = "DESC") OrderType orderType) {
        List<BoardTO> allBoards = boardService.findAllBoardWithBoardTO(orderType);
        return new ResponseEntity<List<BoardTO>>(allBoards, HttpStatus.OK);
    }

    @RequestMapping(value = "/board/insert", method = RequestMethod.POST)
    public HttpEntity<BoardTO> insert(@RequestBody BoardTO boardTO) {
        BoardTO insertedBoard = boardService.insert(boardTO);
        insertedBoard.add(linkTo(methodOn(BoardController.class).listAll(OrderType.DESC)).withRel("listAll"));;
        return new ResponseEntity<BoardTO>(insertedBoard, HttpStatus.OK);
    }
}
