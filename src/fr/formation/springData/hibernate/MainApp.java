package fr.formation.springData.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import fr.formation.springData.hibernate.model.Client;




//import java.sql.Connection;
//import java.sql.DriverManager;

public class MainApp {

	public static void main(String[] args) {

//		String url = "jdbc:mysql://localhost:3306/employee?allowPublicKeyRetrieval=true&useSSL=false";
//		String username = "rahmi";
//		String password = "rahmi";
//		
//		try {
//			Connection connection = DriverManager.getConnection(url, username, password);
//			System.out.println("Connected !");
//			System.out.println(connection);
//				
//		} catch (Exception e) {
//			System.out.println(e.toString());		
//		}
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Client.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();

	}

}
