package com.iset.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import com.iset.entities.Societe;

public interface SocieteRepository extends JpaRepository<Societe,Long> {
	@RestResource(path = "name") 
	 List<Societe> findByName(@Param("name") String name);
}
