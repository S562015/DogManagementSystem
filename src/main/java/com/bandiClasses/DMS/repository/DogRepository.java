package com.bandiClasses.DMS.repository;

import java.util.List;

/*
 * @author: Nagarjuna Reddy Kunkala(S562015)
 */


import org.springframework.data.repository.CrudRepository;

import com.bandiClasses.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer> {
	List<Dog> findByName(String name);
}
