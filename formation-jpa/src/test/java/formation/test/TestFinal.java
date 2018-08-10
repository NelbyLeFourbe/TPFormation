package formation.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;


import sopra.promo404.formation.app.Application;
import sopra.promo404.formation.model.Formateur;
import sopra.promo404.formation.model.Personne;

public class TestFinal {

	public static void main(String[] args) {

		EntityManager em = null;
		EntityTransaction tx = null;
		
		try {
			em = Application.getInstance().getEmf().createEntityManager();
			tx = em.getTransaction();
			tx.begin();
			
			Personne miss = new Formateur ("Miss", "2012", false, 6);
			em.persist(miss);

			 //iphone = new Produit("IPhone X", 1150);
			//iphone.setFournisseur(apple);
			//em.persist(iphone);

			//em.flush(); implicite
			tx.commit(); 
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null) {
				tx.rollback();
			}
		} finally {
			if (em != null) {
				em.close();
			}
		}
	}

}
