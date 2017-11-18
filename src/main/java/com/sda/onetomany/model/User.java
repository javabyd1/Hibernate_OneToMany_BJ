package com.sda.onetomany.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "USER")
public class User {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "USER_ID")
	private int userId;
	@Column(name = "USER_NAME")
	private String userName;
	@Column(name = "USER_SURNAME")
	private String userSurname;
	@Column(name = "USER_ADDRESS")
	private String userAddress;

	@OneToMany(mappedBy="user", cascade = CascadeType.ALL)
	private List<UserOrder> orderList = new ArrayList<UserOrder>();

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserSurname() {
		return userSurname;
	}

	public void setUserSurname(String userSurname) {
		this.userSurname = userSurname;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public List<UserOrder> getOrdersList() {
		return orderList;
	}

	public void setVehiclesList(List<UserOrder> vehiclesList) {
		this.orderList = vehiclesList;
	}

	@Override
	public String toString() {
		return "User{" +
				"userId=" + userId +
				", userName='" + userName + '\'' +
				", userSurname='" + userSurname + '\'' +
				", userAddress='" + userAddress + '\'' +
				'}';
	}
}
