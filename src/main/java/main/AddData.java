/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entities.Movie;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Sebastian
 */
public class AddData {

    public static void main(String[] args) {
        EntityManagerFactory EMF = Persistence.createEntityManagerFactory("pu");
        EntityManager em = EMF.createEntityManager();
        em.getTransaction().begin();
        em.createNamedQuery("Movie.deleteAllRows").executeUpdate();
        em.persist(new Movie(1994, "More text", new String[]{"Egon Olsen", "Benny"}, 200000));
        em.persist(new Movie(1231, "Harry Rotter", new String[]{"Svend Svend", "Henrik"}, 212112));
        em.persist(new Movie(2666, "Rarry Hotter", new String[]{"Svend John", "Henrik"}, 2121212));
        em.persist(new Movie(2132, "Des", new String[]{"Svend Clausen", "Henrik"}, 532423));
        em.persist(new Movie(2012, "troy", new String[]{"Svend Hends", "Henrik"}, 2342332));
        em.persist(new Movie(2323, "Humans", new String[]{"Svend Mogensen", "Henrik"}, 3400000));
        em.getTransaction().commit();
    }
}
