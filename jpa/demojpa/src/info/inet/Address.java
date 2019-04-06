package info.inet;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ADDRESS_TBL database table.
 * 
 */
@Entity
@Table(name="ADDRESS_TBL")
@NamedQuery(name="Address.findAll", query="SELECT a FROM Address a")
public class Address implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long aid;

	private String city;

	@Column(name="\"STATE\"")
	private String state;

	public Address() {
	}

	public long getAid() {
		return this.aid;
	}

	public void setAid(long aid) {
		this.aid = aid;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

}