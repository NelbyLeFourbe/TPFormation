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
	public List<Eleve> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Eleve findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Eleve save(Eleve entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Eleve entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	
	
}
