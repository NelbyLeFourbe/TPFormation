package formation.test;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestJpaVal {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("tpformation");
		// EntityManager em = emf.createEntityManager();
		// EntityTransaction tx = em.getTransaction();
		// tx.begin();
		//
		// List<Matiere> matieres = em.createQuery("select s from Matiere s",
		// Matiere.class).getResultList();
		//
		// for (Matiere matiere : matieres) {
		// System.out.println(matiere.getDuree());
		// }
		//
		// tx.commit();
		// em.close();
		emf.close();
	}

}
