package com.iset;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.iset.Repository.SocieteRepository;
import com.iset.entities.Societe;

@SpringBootApplication
public class SocieteApplication implements CommandLineRunner{
@Autowired
SocieteRepository repo;
	public static void main(String[] args) {
		SpringApplication.run(SocieteApplication.class, args);
	}

@Override
public void run(String... args) throws Exception {
	// TODO Auto-generated method stub
	
	
	repo.save(new Societe(null, "A", 100));
	repo.save(new Societe(null, "B", 200));
	repo.save(new Societe(null, "C", 300));
	
}

}
