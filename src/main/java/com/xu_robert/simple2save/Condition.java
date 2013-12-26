package com.xu_robert.simple2save;

import com.xu_robert.simple2save.Query.Comparator;

public interface Condition<E> {
	
	Condition<E> filter(String fieldName, Comparator cmp, Object sub);
	Condition<E> filter(String fieldName, Comparator cmp, Object sub, boolean caseSensitive);
	
	Condition<E> exclude(String fieldName, Comparator cmp, Object sub);
	Condition<E> exclude(String fieldName, Comparator cmp, Object sub, boolean caseSensitive);
	
	Condition<E> contain(String fieldName, Comparator cmp, Object sub);
	Condition<E> contain(String fieldName, Comparator cmp, Object sub, boolean caseSensitive);
	
	Condition<E> or();
	Condition<E> and();
	
	Condition<E> condition(Condition<E> cond);
	
}
