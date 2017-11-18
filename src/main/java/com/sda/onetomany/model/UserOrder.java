package com.sda.onetomany.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "USER_ORDER")
public class UserOrder {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "ORDER_ID")
	private int orderId;
	@ManyToOne
	@JoinColumn(name="USER_ID")
	private User user;
	@Column(name = "ORDER_LIST")
	private String orderList;
	@Column(name = "ORDER_DATE")
	private LocalDate orderDate;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getOrderList() {
		return orderList;
	}

	public void setOrderList(String orderList) {
		this.orderList = orderList;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	@Override
	public String toString() {
		return "UserOrder{" +
				"orderId=" + orderId +
				", user=" + user +
				", orderList='" + orderList + '\'' +
				", orderDate=" + orderDate +
				'}';
	}
}
