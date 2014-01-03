package com.xu_robert.simple2save;

public interface DatabaseFactory {

	/**
	 * Retrieve the prefix for each table
	 *
	 * @return common prefix for each table
	 */
	String getPrefix();

	/**
	 * Register a model with the database factory.
	 *
	 * @param model Database Model
	 * @return this DatabaseFactory
	 */
	DatabaseFactory registerModel(Class<? extends Model> model);

	/**
	 * Set the prefix for each table
	 *
	 * @param prefix Table prefix
	 * @return this DatabaseFactory
	 */
	DatabaseFactory setPrefix(String prefix);

	/**
	 * Pool multiple connections for the database.<br/>
	 * This sets up a connection pool if more than one idle
	 * connection is wanted at a time.
	 *
	 * @param connections Connections to pool. Defaults to 1 (no pool)
	 * @return this DatabaseFactory
	 */
	DatabaseFactory pool(int connections);

	/**
	 * Attempt to connect to the database and create/alter tables.
	 *
	 * @return Database representing the connection from this DatabaseFactory
	 */
	Database connect();

}
