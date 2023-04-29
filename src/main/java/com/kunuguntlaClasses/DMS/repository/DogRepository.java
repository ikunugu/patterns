package com.kunuguntlaClasses.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.kunuguntlaClasses.DMS.Models.Dog;
/**
 * 
 * @author Indu Sri Kunuguntla
 *
 */

public interface DogRepository extends CrudRepository<Dog, Integer> {
	
	List<Dog>findByName(String name);

}
