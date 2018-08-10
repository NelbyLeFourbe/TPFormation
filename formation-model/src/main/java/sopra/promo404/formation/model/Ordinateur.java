package sopra.promo404.formation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

//@Entity
@Table(name = "Computers")
public class Ordinateur {
	@Id
	@Column(name = "Code", length = 10, nullable = false)
	private String code;
	@Column(name = "Ram", length = 10, nullable = false)
	private int ram;
	@Column(name = "Ssd", nullable = false)
	private boolean ssd;
	@Transient
	@Column(name = "Eleve", length = 100)
	private Eleve eleve;

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

	public Eleve getEleve() {
		return eleve;
	}

	public void setEleve(Eleve eleve) {
		this.eleve = eleve;
	}

	@Override
	public String toString() {
		return "Ordinateur [code=" + code + ", ram=" + ram + ", ssd=" + ssd + "]";
	}

}
