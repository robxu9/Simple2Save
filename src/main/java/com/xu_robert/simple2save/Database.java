package com.xu_robert.simple2save;

import com.xu_robert.simple2save.query.Condition;
import com.xu_robert.simple2save.query.Query;

public interface Database {

	void disconnect();

	<E extends Model> Result<E> clear(Class<E> clazz);

	<E extends Model> Result<E> insert(E obj);

	<E extends Model> Result<E> update(E obj);

	<E extends Model> Result<E> remove(E obj);

	<E extends Model> Query<E> query(Class<E> clazz);

	<E extends Model> Condition<E> makeCondition(Class<E> clazz);

	/**
	 * Load relationships in the model. Whereas a query would normally
	 * return relationships as null, this allows the null fields to be
	 * replaced with fully functioning data.<br/>
	 * This can be an expensive operation on certain databases, sadly;
	 * use only when necessary! For example, if you don't need the user
	 * reference, don't load it!
	 *
	 * @param obj       Model object to load properties to
	 * @param fieldName Field name containing properties
	 * @param <E>       Must be a Model class
	 */
	<E extends Model> void loadRelations(E obj, String fieldName);

	// may not be necessary with list manip
	<E extends Model, V> M2MHelper<V> loadM2M(E obj, String fieldName, Class<V> type);

}
