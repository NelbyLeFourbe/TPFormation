package sopra.promo404.formation.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "Subject")
public class Matiere {
	@Id
	@GeneratedValue
	private Long id;
	@Column(name = "Name")
	private String nom;
	@Column(name = "Duration")
	private int duree;
	@Column(name = "Difficulty")
	@Enumerated(EnumType.STRING)
	private Difficulte difficulte;
	@ManyToMany(mappedBy = "matieres")
	private List<Formateur> formateurs = new ArrayList<>();

	public Matiere() {
		super();
	}

	public Matiere(Long id, String nom, int duree, Difficulte difficulte) {
		super();
		this.id = id;
		this.nom = nom;
		this.duree = duree;
		this.difficulte = difficulte;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public Difficulte getDifficulte() {
		return difficulte;
	}

	public void setDifficulte(Difficulte difficulte) {
		this.difficulte = difficulte;
	}

	public List<Formateur> getFormateurs() {
		return formateurs;
	}

	public void setFormateurs(List<Formateur> formateurs) {
		this.formateurs = formateurs;
	}

}
