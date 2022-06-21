package com.tts.UsersAPI.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tts.UsersAPI.Models.User;

@Repository
public interface UserRespository extends CrudRepository<User, Long>{
	List<User> findByState(String state);
}
