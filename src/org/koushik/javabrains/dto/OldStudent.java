package org.koushik.javabrains.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OldStudent {

	@Id
	private int studentId;
	private String studentName;
	private String email;
	private String address;

	
	
	public OldStudent(int studentId, String studentName, String email, String address) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.email = email;
		this.address = address;
	}

	public OldStudent() {
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
