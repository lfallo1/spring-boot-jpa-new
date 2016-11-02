package com.lancefallon.modules.suit.model;

import java.io.Serializable;

import com.lancefallon.modules.superhero.model.Superhero;

public class Suit implements Serializable {

	private static final long serialVersionUID = -907958895666668249L;

	private Integer id;
	private String material;
	private String color;
	private Superhero superhero;
	
	public Suit(){}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Superhero getSuperhero() {
		return superhero;
	}

	public void setSuperhero(Superhero superhero) {
		this.superhero = superhero;
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
		Suit other = (Suit) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}