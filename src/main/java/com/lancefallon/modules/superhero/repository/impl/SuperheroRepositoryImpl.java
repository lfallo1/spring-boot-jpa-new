package com.lancefallon.modules.superhero.repository.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Service;

import com.lancefallon.modules.superhero.model.Superhero;
import com.lancefallon.modules.superhero.repository.SuperheroRepository;

@Service
public class SuperheroRepositoryImpl extends JdbcDaoSupport implements SuperheroRepository {

	@Autowired
	public SuperheroRepositoryImpl(DataSource dataSource){
		setDataSource(dataSource);
	}
	
	//basic row mapper for a superhero object
	private final RowMapper<Superhero> superheroRowMapper = (rs,rowNum)->{
			Superhero superhero = new Superhero();
			superhero.setId(rs.getInt(SuperheroRepository.Rows.SUPERHERO_ID_COL));
			superhero.setAlias(rs.getString(SuperheroRepository.Rows.SUPERHERO_ALIAS_COL));
			superhero.setFirstName(rs.getString(SuperheroRepository.Rows.SUPERHERO_FNAME_COL));
			superhero.setLastName(rs.getString(SuperheroRepository.Rows.SUPERHERO_LNAME_COL));
			return superhero;
		};
	
	/**
	 * find all superheroes
	 */
	public List<Superhero> findAll(){
		return getJdbcTemplate().query(SuperheroRepository.Sql.FIND_ALL, superheroRowMapper);
	}
	
}
