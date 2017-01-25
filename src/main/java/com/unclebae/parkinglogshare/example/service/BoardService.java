package com.unclebae.parkinglogshare.example.service;

import com.unclebae.parkinglogshare.example.enums.OrderType;
import com.unclebae.parkinglogshare.example.transferobj.BoardTO;

import java.util.List;

/**
 * Created by KIDO on 2017. 1. 25..
 */
public interface BoardService {
    List<BoardTO> findAllBoardWithBoardTO(OrderType orderType);

    BoardTO insert(BoardTO boardTO);

    BoardTO findAllBoardWithSort(OrderType orderType);
}
