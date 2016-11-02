package com.lancefallon.config;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import com.lancefallon.config.constants.DbContextHolder;

public class DbRoutingDataSourceUtil extends AbstractRoutingDataSource {

	@Override
	protected Object determineCurrentLookupKey() {
		return DbContextHolder.getDBType();
	}

}
