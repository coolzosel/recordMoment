package com.jeonghwa.moment.model.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import model.domain.Board;
import model.domain.Liked;
import model.domain.User;


public interface LikeRepository extends JpaRepository<Liked, Long>{
	
	Optional<Liked> findByUserAndBoard(User user, Board board);
}
