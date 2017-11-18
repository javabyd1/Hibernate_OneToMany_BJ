package com.sda.onetomany;

import com.sda.onetomany.model.User;
import com.sda.onetomany.model.UserOrder;
import com.sda.onetomany.model.dao.ModelDao;

import java.time.LocalDate;

public class HibernateTest {

	public static void main(String[] args) {

		ModelDao modelDao = new ModelDao();
		User user1 = new User();
		user1.setUserName("Bartosz");
		user1.setUserSurname("Janczak");
		user1.setUserAddress("Bdg Sklodowskiej-Curie 10");

//		modelDao.addUser(user1);
		UserOrder order1 = new UserOrder();
		order1.setUser(user1);
		order1.setOrderList("kalkulator, blok tehniczny, długopis");
		order1.setOrderDate(LocalDate.of(2017, 11, 18));

		UserOrder order2 = new UserOrder();
		order2.setUser(user1);
		order2.setOrderList("chleb, ser, szynka");
		order2.setOrderDate(LocalDate.of(2017, 11, 18));

		UserOrder order3 = new UserOrder();
		order3.setUser(user1);
		order3.setOrderList("laptop, klawiatura, myszka");
		order3.setOrderDate(LocalDate.of(2017, 11, 20));

//		modelDao.addOrder(order1);
//		modelDao.addOrder(order2);
//		modelDao.addOrder(order3);

		modelDao.getData(5);

		modelDao.closeSession();
	}
}
