/**
 * 
 */
package com.sarkar.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sarkar.model.User;

/**
 * @author gosarkar
 *
 */
public interface UserRepository extends CrudRepository<User, String>{
	
	//List<User> findByName(String userId);

}
