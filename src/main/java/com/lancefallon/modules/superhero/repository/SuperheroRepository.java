package com.lancefallon.modules.superhero.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lancefallon.modules.superhero.model.Superhero;

@Repository
public interface SuperheroRepository {
	
	class Rows {
		public static final String SUPERHERO_ID_COL = "superhero_id";
		public static final String SUPERHERO_ALIAS_COL = "alias";
		public static final String SUPERHERO_FNAME_COL = "first_name";
		public static final String SUPERHERO_LNAME_COL = "last_name";
	}
	
	class Sql {
		public static final String FIND_ALL = "SELECT * FROM Superhero";
	}

	public List<Superhero> findAll();
	
}
