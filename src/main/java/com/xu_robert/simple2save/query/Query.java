package com.xu_robert.simple2save.query;

import com.xu_robert.simple2save.Result;

public interface Query<E> {

	public enum Comparator {
		EQ, LT, LE, GT, GE;
	}

	Query<E> filter(String fieldName, Comparator cmp, Object sub);

	Query<E> filter(String fieldName, Comparator cmp, Object sub, boolean caseSensitive);

	Query<E> exclude(String fieldName, Comparator cmp, Object sub);

	Query<E> exclude(String fieldName, Comparator cmp, Object sub, boolean caseSensitive);

	Query<E> contain(String fieldName, Comparator cmp, Object sub);

	Query<E> contain(String fieldName, Comparator cmp, Object sub, boolean caseSensitive);

	Query<E> limit(long limit);

	Query<E> offset(long offset);

	public enum Sort {
		ASC, DESC;
	}

	Query<E> sort(String fieldName, Sort sort);

	// parenthesis
	Query<E> condition(Condition<E> cond);

	Result<E> all();

	long count();

	E one();

}
