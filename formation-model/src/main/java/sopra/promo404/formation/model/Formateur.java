package sopra.promo404.formation.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "Trainer")
@DiscriminatorValue("Trainer")
public class Formateur extends Personne {
	@Column(name = "Owner")
	private boolean referent;
	@Column(name = "Experience")
	private int experience;
	private List<Eleve> eleves = new ArrayList<>();
	@ManyToMany
	@JoinTable(name = "Trainer_Subject", uniqueConstraints = @UniqueConstraint(columnNames = { "Trainer_Id",
			"Subject_Id" }), joinColumns = @JoinColumn(name = "Trainer_Id"), inverseJoinColumns = @JoinColumn(name = "Subject_Id"))
	private Set<Matiere> matieres = new HashSet<>();

	public Formateur() {
		super();
	}

	public Formateur(String nom, String prenom, boolean referent, int experience) {
		super(nom, prenom);
		this.referent = referent;
		this.experience = experience;
	}

	public boolean isReferent() {
		return referent;
	}

	public void setReferent(boolean referent) {
		this.referent = referent;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public List<Eleve> getEleves() {
		return eleves;
	}

	public void setEleves(List<Eleve> eleves) {
		this.eleves = eleves;
	}

	public void addEleve(Eleve eleve) {
		this.eleves.add(eleve);
	}

	public void removeEleve(Eleve eleve) {
		this.eleves.remove(eleve);
	}

	public Set<Matiere> getMatieres() {
		return matieres;
	}

	public void setMatieres(Set<Matiere> matieres) {
		this.matieres = matieres;
	}

	public void addMatiere(Matiere matiere) {
		this.matieres.add(matiere);
	}

	public void removeMatiere(Matiere matiere) {
		this.matieres.remove(matiere);
	}

}
