package com.unclebae.parkinglogshare.example.service;

import com.google.common.collect.Lists;
import com.mysema.query.jpa.impl.JPAQuery;
import com.unclebae.parkinglogshare.example.converter.BeanCopy;
import com.unclebae.parkinglogshare.example.entity.Board;
import com.unclebae.parkinglogshare.example.enums.OrderType;
import com.unclebae.parkinglogshare.example.repository.BoardRepository;
import com.unclebae.parkinglogshare.example.transferobj.BoardTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by KIDO on 2017. 1. 25..
 */
@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    BoardRepository boardRepository;

    @Override
    public List<BoardTO> findAllBoardWithBoardTO(OrderType orderType) {

        ArrayList<Board> boards = Lists.newArrayList(boardRepository.findAll());

        if (CollectionUtils.isEmpty(boards)) return Lists.newArrayList();

        return boards.stream()
                .map(board -> BeanCopy.copy(board, BoardTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public BoardTO insert(BoardTO boardTO) {
        LocalDateTime now = LocalDateTime.now();

        Board copyedBoard = BeanCopy.copy(boardTO, Board.class);
        copyedBoard.setRegdate(now);
        copyedBoard.setModdate(now);
        Board savedBoard = boardRepository.save(copyedBoard);
        return BeanCopy.copy(savedBoard, BoardTO.class);
    }

    @Override
    public BoardTO findAllBoardWithSort(OrderType orderType) {

       return null;
    }
}
