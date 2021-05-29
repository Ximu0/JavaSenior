package com.atschool.java1;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;

/**
 *
 * @author wms
 * @create 2021-03-24-17:54
 */
@Inherited
@Repeatable(MyAnnotations.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE, MODULE,TYPE_PARAMETER,TYPE_USE})
public @interface MyAnnotation {

    String value() default "hello";
}
