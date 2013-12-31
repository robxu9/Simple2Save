package com.xu_robert.simple2save.annotation;

import java.lang.annotation.*;

/**
 * Identifies a method that will be run before
 * the object is committed to the table.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Save {
}
