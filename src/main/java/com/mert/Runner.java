package com.mert;

import com.mert.entity.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Runner {
    public static void main(String[] args) {
        /**
         * Burada öncelikle hibernate ile veritabanı oluşturulur. Ki bunu oluşturduk
         * Depencies -> META-INF-> persistence .xml sonrasında (entity class ları eklemek önemli)
         *
         */
        Product product = new Product(1L,"Akıllı Saat");
        // yukarıda basit yöntemle bir tane product oluşturduk.

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CRM");
        // Persistence.createEntityManagerFactory("CRM") ile veritabanı oluşturuldu.
        // Bu sayede persistence.xml dosyasına göre veritabanı oluşturuldu ve artık gerekli bağlantı ve işlemleri yapabiliriz.

        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin(); // veritabanına bağlantıyı açtık
        em.persist(product); // veritabanına product objesini ekle
        em.getTransaction().commit(); // veritabanına bağlantıyı kapatdık
        em.close();
        emf.close();
    }
}
