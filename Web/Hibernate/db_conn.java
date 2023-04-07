

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
   private static final SessionFactory sessionFactory = buildSessionFactory();

   private static SessionFactory buildSessionFactory() {
      try {
         // Create the SessionFactory from hibernate.cfg.xml
         Configuration configuration = new Configuration();
         configuration.configure();
         SessionFactory sessionFactory = configuration.buildSessionFactory();
         return sessionFactory;
      } catch (Throwable ex) {
         // Make sure you log the exception, as it might be swallowed
         System.err.println("Initial SessionFactory creation failed." + ex);
         throw new ExceptionInInitializerError(ex);
      }
   }
  
   
      public static SessionFactory getSessionFactory() {
      return sessionFactory;
   }
   
     public static void shutdown() {
      // Close caches and connection pools
      getSessionFactory().close();
   }
 }


/*
xml config mysql
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE hibernate-configuration PUBLIC "-//Hibernate/Hibernate Configuration DTD 3.0//EN" "http://www.hibernate.org/dtd/hibernate-configuration-3.0.dtd">

<hibernate-configuration>
  <session-factory>
    <property name="hibernate.connection.driver_class">com.mysql.cj.jdbc.Driver</property>
    <property name="hibernate.connection.url">jdbc:mysql://localhost:3306/mydatabase</property>
    <property name="hibernate.connection.username">myuser</property>
    <property name="hibernate.connection.password">mypassword</property>
    <property name="hibernate.dialect">org.hibernate.dialect.MySQL5Dialect</property>
    <property name="hibernate.hbm2ddl.auto">update</property>
  </session-factory>
</hibernate-configuration>
*/
