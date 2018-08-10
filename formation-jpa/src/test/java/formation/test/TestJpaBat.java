package formation.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import formation.Application;
import sopra.promo404.formation.model.Ordinateur;

public class TestJpaBat {

	public static void main(String[] args) {

		exempleStatement();
		exemplePreparedStatement();
		}

		private static void exempleStatement() {
			try {
				
				Class.forName("org.postgresql.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

			Connection conn = null;

			try {
				
				conn = Application.getInstance().createConnection();

				// 4. Création d'un Statement pour exécution d'une requête
				Statement st = conn.createStatement();
				ResultSet rs = st.executeQuery("SELECT id, prenom FROM ELEVE WHERE prenom LIKE 'A%'");

				// 5. Boucle de lecture sur le resultSet
				while (rs.next()) {
					Long id = rs.getLong("id");
					String nom = rs.getString("nom");
				}

			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					// 6. Fermeture de la connexion
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		private static void exemplePreparedStatement() {
			try {
				// 2. Chargement en mémoire du Driver cible
				Class.forName("org.postgresql.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

			Connection conn = null;

			try {
				// 3. Ouverture du connection à la base de données en précisant l'url et les
				// informations de connexion
				conn = Application.getInstance().createConnection();

				// 4. Création d'un PreparedStatement pour préparation d'une requête
				PreparedStatement pst = conn.prepareStatement("SELECT id, prenom FROM ELEVE WHERE prenom LIKE ?");
				
				// 4Bis. Passage du paramètre 1 pour remplacer le ? par 'A%'
				pst.setString(1, "A%");
				
				ResultSet rs = pst.executeQuery();

				// 5. Boucle de lecture sur le resultSet
				while (rs.next()) {
					Long id = rs.getLong("id");
					String nom = rs.getString("nom");
				}

			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					// 6. Fermeture de la connexion
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
}


		
	


