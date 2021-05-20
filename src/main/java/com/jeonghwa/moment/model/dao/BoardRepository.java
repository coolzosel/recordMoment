package com.jeonghwa.moment.model.dao;

import org.springframework.data.repository.CrudRepository;

import model.domain.Board;

public interface BoardRepository extends CrudRepository<Board, Long> {

}
