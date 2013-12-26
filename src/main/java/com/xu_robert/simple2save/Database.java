package com.xu_robert.simple2save;

public abstract class Database {
	
	private static Database CONNECTION = null;
	private static DatabaseFactory FACTORY = null;
	private static String PREFIX = "";
	
	public static DatabaseFactory getFactory() {
		return FACTORY;
	}
	
	public static void setFactory(DatabaseFactory factory) {
		FACTORY = factory;
	}
	
	public static void registerClass(Class<?> clazz) {
		
	}
	
	public static String getPrefix() {
		return PREFIX;
	}
	
	public static void setPrefix(String prefix) {
		PREFIX = prefix;
	}
	
	public static void connect() {
		CONNECTION = FACTORY.getDatabase();
	}
	
	public static void disconnect() {
		CONNECTION.die();
		CONNECTION = null;
	}

	protected abstract void die();
	
	public abstract <E> Query<E> queryDB(Class<E> clazz);
	public abstract <E> Condition<E> makeCondition(Class<E> clazz);
	
	public abstract void loadRelations(Object obj, String fieldName);
	//public abstract ManageM2M manageM2M(Object obj, String fieldName);
	
}
