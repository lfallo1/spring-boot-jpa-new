package com.lancefallon.modules.suit.repository.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Service;

import com.lancefallon.modules.suit.model.Suit;
import com.lancefallon.modules.suit.repository.SuitRepository;

@Service
public class SuitRepositoryImpl extends JdbcDaoSupport implements SuitRepository {

	@Autowired
	public SuitRepositoryImpl(DataSource dataSource){
		setDataSource(dataSource);
	}
	
	public List<Suit> findAll(){
		return null;
	}
	
}
