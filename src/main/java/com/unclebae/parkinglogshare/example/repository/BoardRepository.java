package com.unclebae.parkinglogshare.example.repository;

import com.unclebae.parkinglogshare.example.entity.Board;
import org.springframework.data.jpa.repository.support.QueryDslRepositorySupport;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by KIDO on 2017. 1. 25..
 */
public interface BoardRepository extends CrudRepository<Board, Long>, QueryDslPredicateExecutor<Board> {

}
