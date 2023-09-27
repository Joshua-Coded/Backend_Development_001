package com.joshua.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//       object for Alien
    	Alien joshua = new Alien();
    	joshua.setAid(101);
    	joshua.setAname("Joshua");
    	joshua.setColor("yellow");
    	
    	
//    	save those data in  the database persisting.
    	Configuration con = new Configuration();
    	
    	SessionFactory sf = con.buildSessionFactory();
    	
    	Session session = sf.openSession();
    	
    	session.save(joshua);
    }
}
