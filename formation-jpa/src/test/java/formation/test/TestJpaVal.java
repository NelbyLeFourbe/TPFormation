package formation.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import sopra.promo404.formation.model.Matiere;

public class TestJpaVal {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("tpformation");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		List<Matiere> matieres = em.createQuery("select p from Trainer p", Matiere.class).getResultList();

		for (Matiere matiere : matieres) {
			System.out.println(matiere.getDuree());
		}

		tx.commit();
		em.close();
		emf.close();
	}

}
