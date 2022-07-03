package org.koushik.javabrains.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "UserDETAUKS")
public class UserDetailsNew {

	private int userId;

	
	private String userName;

	
	private Date joinedDate;

	private String Address;

	private String lobTest;
	
	private String description;

	@Id
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Column(name = "nishib")
	public String getUserName() {
		return userName + "hehe";
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Temporal(TemporalType.DATE)
	public Date getJoinedDate() {
		return joinedDate;
	}

	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	@Transient
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Lob
	public String getLobTest() {
		return lobTest;
	}

	public void setLobTest(String lobTest) {
		this.lobTest = lobTest;
	}

	@Override
	public String toString() {
		return "UserDetailsNew [userId=" + userId + ", userName=" + userName + ", joinedDate=" + joinedDate
				+ ", Address=" + Address + ", lobTest=" + lobTest + ", description=" + description + "]";
	}
	
	

}
