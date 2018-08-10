package formation.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import sopra.promo404.formation.model.Ordinateur;

public class TestJpaBat {

	public static void main(String[] args) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("tpformation");
			EntityManager em = emf.createEntityManager();
			EntityTransaction tx = em.getTransaction();
			tx.begin();

			List<Ordinateur> ordinateurs = em.createQuery("select c from  Computer c", Ordinateur.class).getResultList();

			for (Ordinateur ordinateur : ordinateurs) {
				System.out.println(ordinateur.getCode());
			}

			tx.commit();
			em.close();
			emf.close();
		}
	}


