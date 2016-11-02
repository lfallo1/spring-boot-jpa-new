package com.lancefallon.config;

import java.beans.PropertyVetoException;
import java.util.HashMap;

import javax.servlet.Filter;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.lancefallon.config.constants.DbConstants;
import com.lancefallon.config.filter.DbFilter;
import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@EnableScheduling
@ComponentScan("com.lancefallon")
public class ServletConfig extends WebMvcConfigurerAdapter {

	@Bean
	public Filter DbFilter() {
		return new DbFilter();
	}

	public DataSource getDefaultDataSource() throws PropertyVetoException {

		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		dataSource.setDriverClass("org.postgresql.Driver");
		dataSource.setJdbcUrl("jdbc:postgresql://127.0.0.1:5432/superhero");
		dataSource.setUser("postgres");
		dataSource.setPassword("admin");
		dataSource.setMaxPoolSize(1000);
		dataSource.setMinPoolSize(10);
		dataSource.setMaxStatements(0);
		dataSource.setMaxStatementsPerConnection(100);
		dataSource.setStatementCacheNumDeferredCloseThreads(1);
		dataSource.setNumHelperThreads(20);

		return dataSource;
	}

	public DataSource getSecureDataSource() throws PropertyVetoException {

		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		dataSource.setDriverClass("org.postgresql.Driver");
		dataSource.setJdbcUrl("jdbc:postgresql://127.0.0.1:5432/MyGene2");
		dataSource.setUser("postgres");
		dataSource.setPassword("admin");
		dataSource.setMaxPoolSize(1000);
		dataSource.setMinPoolSize(10);
		dataSource.setMaxStatements(0);
		dataSource.setMaxStatementsPerConnection(100);
		dataSource.setStatementCacheNumDeferredCloseThreads(1);
		dataSource.setNumHelperThreads(20);

		return dataSource;
	}

	@Bean
	public DataSource getDataSource() throws PropertyVetoException {
		DbRoutingDataSourceUtil dbRoutingDataSourceUtil = new DbRoutingDataSourceUtil();

		HashMap<Object, Object> targetDataSources = new HashMap<>();
		targetDataSources.put(DbConstants.DB_DEFAULT, getDefaultDataSource());
		targetDataSources.put(DbConstants.DB_SECURE, getSecureDataSource());
		dbRoutingDataSourceUtil.setTargetDataSources(targetDataSources);
		return dbRoutingDataSourceUtil;
	}
}
