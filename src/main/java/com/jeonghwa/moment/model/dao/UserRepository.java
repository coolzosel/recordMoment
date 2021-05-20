package com.jeonghwa.moment.model.dao;

import org.springframework.data.repository.CrudRepository;

import model.domain.User;

public interface UserRepository extends CrudRepository<User, String> {

}
