package com.xu_robert.simple2save.annotation;

import java.lang.annotation.*;

/**
 * Identifies a method that will be run immediately
 * after the table is loaded into the object
 * (before it is returned to the stack).
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Load {
}
