package com.xu_robert.simple2save.annotation;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Relation {

	Relationship relation();

}
