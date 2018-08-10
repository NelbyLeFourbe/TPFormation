package sopra.promo404.formation.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "Training")
public class Formation {
	@EmbeddedId
	private FormationId id;
	@Column(name = "Duration")
	private int duree;
	@ManyToMany
	@JoinTable(name = "Training_Subject", joinColumns = { @JoinColumn(name = "customer_id"),
			@JoinColumn(name = "promotion_id") }, inverseJoinColumns = @JoinColumn(name = "subject_id"), uniqueConstraints = @UniqueConstraint(columnNames = {
					"customer_id", "promotion_id", "subject_id" }))
	private List<Matiere> matieres = new ArrayList<>();

	public Formation() {
		super();
	}

	public Formation(String client, String promotion) {
		super();
		this.id = new FormationId(client, promotion);
	}

	public FormationId getId() {
		return id;
	}

	public void setId(FormationId id) {
		this.id = id;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public List<Matiere> getMatieres() {
		return matieres;
	}

	public void setMatieres(List<Matiere> matieres) {
		this.matieres = matieres;
	}

}
