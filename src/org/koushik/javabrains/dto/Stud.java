package org.koushik.javabrains.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Stud {

	@Id
	private int id;
	private String name;
	private String email;

	public Stud() {
		super();
	}

	public Stud(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Stud [id=" + id + ", name=" + name + ", email=" + email + "]";
	}

	
	
}
