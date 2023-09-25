package com.joshua.DemoHib;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
{

    	Joshua joshua = new Joshua();
    	
    	joshua.setJid(101);
    	joshua.setJname("Alana");
    	joshua.setColor("green");
    	
    	
    	Configuration con = new Configuration().configure().addAnnotatedClass(Joshua.class);
    	
    	ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
    	
    	
    	
    	SessionFactory  sf = con.buildSessionFactory(reg);
    	
    	Session session = sf.openSession();
 
    	Transaction tx =  session.beginTransaction();
    	
    	session.save(joshua);
    	tx.commit();
    }
}
