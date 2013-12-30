package com.xu_robert.simple2save;

import com.xu_robert.simple2save.query.Condition;
import com.xu_robert.simple2save.query.Query;

public interface Database {

	void disconnect();

	<E> Result<E> clear(Class<E> clazz);

	<E> Result<E> insert(Object obj);

	<E> Result<E> update(Object obj);

	<E> Result<E> remove(Object obj);

	<E> Query<E> query(Class<E> clazz);

	<E> Condition<E> makeCondition(Class<E> clazz);

	void loadRelations(Object obj, String fieldName);
	//M2MHelper loadM2M(Object obj, String fieldName);

}
