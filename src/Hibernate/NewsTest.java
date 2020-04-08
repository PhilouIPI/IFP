package Hibernate;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

class NewsTest {
    //@Test
    public static class MyEntityManagerFactory {
        private static final EntityManagerFactory emFactory;
        static {
            emFactory = Persistence.createEntityManagerFactory("derby-persistence-unit");
        }
        public static EntityManager getEntityManager(){
            return emFactory.createEntityManager();
        }
        public static void close(){
            emFactory.close();
        }
    }
    @BeforeEach
    void setUp() {
    }
    @AfterEach
    void tearDown() {
    }
}