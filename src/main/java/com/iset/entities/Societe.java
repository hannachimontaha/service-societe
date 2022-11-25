package com.iset.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Societe {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
private String name;
private double code;
public Societe(Long id, String name, double code) {
	super();
	this.id = id;
	this.name = name;
	this.code = code;
}

public Societe() {
	super();
	// TODO Auto-generated constructor stub
}

public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getCode() {
	return code;
}
public void setCode(double code) {
	this.code = code;
}

@Override
public String toString() {
	return "Societe [id=" + id + ", name=" + name + ", code=" + code + "]";
}
	

}
