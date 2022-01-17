package fr.formation.springData.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import fr.formation.springData.hibernate.model.Client;
import fr.formation.springData.hibernate.model.Data;
import fr.formation.springData.hibernate.model.Person;




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
				.addAnnotatedClass(Person.class)
				.addAnnotatedClass(Data.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
//		Client client1 = new Client("rachid RAHMI", 40, "rachid.rahmi@hotmail.com");
//		Client client2 = new Client("mous RAHMI", 35, "mous.rahmi@yahoo.com");
//		Client client3 = new Client("youssef RAHMI", 29, "youssef45.rahmi@gmail.com");
//		client.setId((long) 1);
//		client.setFullName("rachid RAHMI");
//		client.setAge(40);
//		client.setAddress("rachid.rahmi@hotmail.com");
		//long id = 2;
		
		/**
		 * start with s%
		 * end with %s
		 * any %s%
		 */
		try {
			session.beginTransaction();
			
//			@SuppressWarnings("deprecation")
//			Criteria c = session.createCriteria(Client.class);
//			c.setProjection(Projections.min("id"));
//			c.setProjection(Projections.max("id"));
//			c.setProjection(Projections.avg("id"));
//			c.setProjection(Projections.count("address"));
//			c.add(Restrictions.isNotNull("address"));
//			Criterion c1 = Restrictions.eq("address", "aya");
//			Criterion c2 = Restrictions.eq("fullName", "Brahim SOUKI");
//			session.createQuery("delete from Client where fullName = 'Boussef RAHMI'").executeUpdate();
//			session.createQuery("update Client set age =50  where id=1").executeUpdate();
//			LogicalExpression or = Restrictions.or(c1, c2);
//			c.add(or);
//			@SuppressWarnings("unchecked")
//			List<Client> clients = c.list();
//			System.out.println(clients.get(0));
//			List<Client> clients = (List<Client>) 
//							//session.createQuery("from Client c where c.fullName Like '%m%'")//='rachid RAHMI'"
//							//		+ "OR c.address ='rachid RAHMI'")
//					session.createQuery("from Client")
//							.list();
//			for(int i=0; i<clients.size(); i++) {
//				System.out.println(clients.get(i).toString());
//			}
//			Query q = session.createQuery("from Client");
			
//			session.save(client1);
//			session.save(client2);
//			session.save(client3);
//			Client client = session.get(Client.class, id);
//			client.setFullName("yasser RAHMI");
//			client.setAge(19);
//			client.setAddress("yasser.rahmi@yahoo.fr");
			
//			Client c = new Client("Brahim SOUKI", 25, "b.souiki@gmail.com");
//			c.setId((long)1);
//			session.update(c);
//			Client c = new Client();
//			c.setId(id);
//			session.delete(c);
			session.getTransaction().commit();
			//System.out.println(c.toString());
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
			
		}finally {
			session.close();
		}
	}

}
