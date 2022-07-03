package org.koushik.javabrains.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UserDETAUKS")
public class UserDetailsNew {

	private int userId;

	
	private String userName;

	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
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

	@Override
	public String toString() {
		return "UserDetailsNew [userId=" + userId + ", userName=" + userName + "]";
	}

	



	
	
	

}
