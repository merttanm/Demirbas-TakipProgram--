/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.io.File;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author mert tan
 */
public class HibernateUtil {
    

    
    public static Session buildSessionFactory() {
        try{
          final SessionFactory sf = new Configuration()
        .configure("/dosya/hibernate.cfg.xml").buildSessionFactory();

   
             final Session session = sf.openSession();
     return session;
        } catch (Throwable ex) {
         
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
       
    }
    
  
}
