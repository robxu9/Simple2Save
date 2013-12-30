package com.xu_robert.simple2save.query;

public interface Condition<E> {

	Condition<E> filter(String fieldName, Query.Comparator cmp, Object sub);

	Condition<E> filter(String fieldName, Query.Comparator cmp, Object sub, boolean caseSensitive);

	Condition<E> exclude(String fieldName, Query.Comparator cmp, Object sub);

	Condition<E> exclude(String fieldName, Query.Comparator cmp, Object sub, boolean caseSensitive);

	Condition<E> contain(String fieldName, Query.Comparator cmp, Object sub);

	Condition<E> contain(String fieldName, Query.Comparator cmp, Object sub, boolean caseSensitive);

	Condition<E> or();

	Condition<E> and();

	Condition<E> condition(Condition<E> cond);

}
