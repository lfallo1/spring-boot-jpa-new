package com.lancefallon.config.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.lancefallon.config.constants.DbConstants;
import com.lancefallon.config.constants.DbContextHolder;

public class DbFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		/**
		 * No specific implementation needed
		 */
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		String dbType = request.getParameter("key");
		if (DbConstants.DB_SECURE.equalsIgnoreCase(dbType)) {
			DbContextHolder.setDBType(DbConstants.DB_SECURE);
		} else {
			DbContextHolder.setDBType(DbConstants.DB_DEFAULT);
		}
		try {
			chain.doFilter(request, response);
		} finally {
			//TODO
		}
	}

	@Override
	public void destroy() {
		/**
		 * No specific implementation needed
		 */
	}

}
