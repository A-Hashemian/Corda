
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        // Create an EntityManagerFactory with the persistence unit name "myDatabase"
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myDatabase");
        
        // Create an EntityManager to interact with the database
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        
        // Begin a new transaction using the EntityTransaction object
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
      
      
    }
