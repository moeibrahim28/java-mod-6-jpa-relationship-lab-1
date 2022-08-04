package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        // create EntityManager
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("example");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // access transaction object
        EntityTransaction transaction = entityManager.getTransaction();



        Country country1 = new Country();
        Country country2 = new Country();
        Country country3 = new Country();
        Country country4 = new Country();

        Capital capital1 = new Capital();
        Capital capital2 = new Capital();
        Capital capital3 = new Capital();
        Capital capital4 = new Capital();

        country1.setName("Canada");
        capital1.setName("Ottawa");
        country1.setCapital(capital1);

        country2.setName("Argentina");
        capital2.setName("Buenos Aires");
        country2.setCapital(capital2);

        country3.setName("Spain");
        capital3.setName("Madrid");
        country3.setCapital(capital3);

        country4.setName("Germany");
        capital4.setName("Berlin");
        country4.setCapital(capital4);

        transaction.begin();

        entityManager.persist(country1);
        entityManager.persist(country2);
        entityManager.persist(country3);
        entityManager.persist(country4);

        entityManager.persist(capital1);
        entityManager.persist(capital2);
        entityManager.persist(capital3);
        entityManager.persist(capital4);

        transaction.commit();


        // close entity manager
        entityManager.close();
        entityManagerFactory.close();
    }
}