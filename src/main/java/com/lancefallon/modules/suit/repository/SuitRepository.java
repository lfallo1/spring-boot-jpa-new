package com.lancefallon.modules.suit.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lancefallon.modules.suit.model.Suit;

@Repository
public interface SuitRepository {
	
	class Rows {
		public static final String SUIT_ID_COL = "suit_id";
		public static final String SUIT_MATERIAL_COL = "material";
		public static final String SUIT_COLOR_COL = "color";
		public static final String SUIT_SUPERHEROID_COL = "superhero_id";
	}
	
	class Sql {
		public static final String FIND_ALL = "SELECT * FROM Suit";
	}

	public List<Suit> findAll();
	
}
