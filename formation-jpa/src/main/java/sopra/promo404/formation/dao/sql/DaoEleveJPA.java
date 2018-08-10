package sopra.promo404.formation.dao.sql;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import sopra.promo404.formation.app.Application;
import sopra.promo404.formation.dao.IDaoEleve;
import sopra.promo404.formation.model.Civilite;
import sopra.promo404.formation.model.Eleve;
import sopra.promo404.formation.model.Formateur;

public class DaoEleveJPA implements IDaoEleve{

	@Override
	public List<Eleve> findAll() {
		
		List<Eleve> liste = new ArrayList<>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = Application.getInstance().createConnection();
			ps = conn.prepareStatement(
					"SELECT id, civilite as civ, nom, prenom, DtNaissance, formateur_id, ordinateur_code FROM eleve");

			rs = ps.executeQuery();

			while (rs.next()) {
				Long id = rs.getLong("id");
				Civilite civilite = Civilite.valueOf(rs.getString("civ"));
				String nom = rs.getString("nom");
				String prenom = rs.getString("prenom");
				Date DtNaissance = rs.getDate("DtNaissance");
				Long formateurId = rs.getLong("formateur_id");
				String ordinateurCode = rs.getString("ordinateur_code");

			

				Eleve obj = new Eleve(id, civilite, nom, prenom, DtNaissance, formateur_id, ordinateur_code);
				obj.setFormateur(formateur);

				liste.add(obj);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				ps.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
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
