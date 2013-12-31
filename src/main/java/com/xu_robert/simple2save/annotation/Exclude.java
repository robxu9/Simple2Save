package com.xu_robert.simple2save.annotation;

import java.lang.annotation.*;

/**
 * Exclude this field from being committed to
 * table along with the rest of the objects.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Exclude {
}
