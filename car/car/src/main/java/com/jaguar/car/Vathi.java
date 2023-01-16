package com.jaguar.car;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Vathi {
	@Id
	private int regno;
	private String name;
	private int age;
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Vathi(int regno, String name, int age) {
		super();
		this.regno = regno;
		this.name = name;
		this.age = age;
	}
	public Vathi() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Vathi [regno=" + regno + ", name=" + name + ", age=" + age + "]";
	}
	

}
