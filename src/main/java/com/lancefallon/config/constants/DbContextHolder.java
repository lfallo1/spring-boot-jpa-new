package com.lancefallon.config.constants;

public class DbContextHolder {

	private static final ThreadLocal<String> contextHolder = new ThreadLocal<>();
	
	public static void setDBType(String dbType) {
		contextHolder.set(dbType);
	}

	public static String getDBType() {
		String holder = contextHolder.get();
		return holder == null ? DbConstants.DB_DEFAULT : holder;
	}

	public static void clearDBType() {
		contextHolder.remove();
	}
	
}
