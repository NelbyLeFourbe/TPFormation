package sopra.promo404.formation.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "Computers")
public class Ordinateur {
	@Id
	@Column(name = "Code", length = 10, nullable = false)
	private String code;
	@Column(name = "Ram", length = 10, nullable = false)
	private int ram;
	@Column(name = "Ssd", nullable = false)
	private boolean ssd;
	@OneToOne
	@JoinTable(name = "Computer_Student", uniqueConstraints = @UniqueConstraint(columnNames = { "Computeur_Code", "Student_Id" }),
	joinColumns = @JoinColumn(name = "Student_Id"),
	inverseJoinColumns = @JoinColumn(name = "Computeur_Code"))
	private List<Eleve> eleve;

	public Ordinateur() {
		super();
	}

	public Ordinateur(String code, int ram, boolean ssd) {
		super();
		this.code = code;
		this.ram = ram;
		this.ssd = ssd;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public boolean isSsd() {
		return ssd;
	}

	public void setSsd(boolean ssd) {
		this.ssd = ssd;
	}

	

	public List<Eleve> getEleve() {
		return eleve;
	}

	public void setEleve(List<Eleve> eleve) {
		this.eleve = eleve;
	}

	@Override
	public String toString() {
		return "Ordinateur [code=" + code + ", ram=" + ram + ", ssd=" + ssd + "]";
	}

}
