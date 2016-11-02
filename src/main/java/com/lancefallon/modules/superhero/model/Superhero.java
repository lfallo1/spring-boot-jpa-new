package com.lancefallon.modules.superhero.model;

import java.io.Serializable;
import java.util.List;

import com.lancefallon.modules.suit.model.Suit;

public class Superhero implements Serializable {

	private static final long serialVersionUID = -907958895666668249L;

	private Integer id;
	private String alias;
	private String firstName;
	private String lastName;

	// one to many
	private List<Suit> suits;

	public Superhero() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Suit> getSuits() {
		return suits;
	}

	public void setSuits(List<Suit> suits) {
		this.suits = suits;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Superhero other = (Superhero) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}