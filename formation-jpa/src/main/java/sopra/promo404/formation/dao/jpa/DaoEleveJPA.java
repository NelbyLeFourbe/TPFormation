package sopra.promo404.formation.dao.jpa;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import sopra.promo404.formation.app.Application;
import sopra.promo404.formation.dao.IDaoEleve;
import sopra.promo404.formation.model.Civilite;
import sopra.promo404.formation.model.Eleve;
import sopra.promo404.formation.model.Formateur;

public class DaoEleveJPA implements IDaoEleve{

	@Override
	List<> liste = new ArrayList<>();
	
	EntityManager em = null;
	EntityTransaction tx = null;
	
	try {
		em = Eshop.getInstance().getEmf().createEntityManager();
		tx = em.getTransaction();
		tx.begin();
		
		Query query = em.createQuery("from Produit", Produit.class);
		liste = query.getResultList();
		
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
	
	return liste;
}
	

	@Override
	public Eleve find(Long id) {
		return null;
	}

	@Override
	public void save(Eleve obj) {
		
	}

	@Override
	public void delete(Eleve obj) {
		
	}

	@Override
	public void deleteById(Long id) {
		
	}

	
}
