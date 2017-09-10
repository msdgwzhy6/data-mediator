package com.heaven7.java.data.mediator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@Fields(serializeName="", propertyNmae="",flags, type=A.class)

/**
 * this class used to describe the field of entity(like java bean).
 * @author heaven7
 * @see Fields
 */
@Target(ElementType.ANNOTATION_TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface Field {

	String propName();
	String seriaName() default "";
	Class<?> type() default String.class;
	int complexType() default 0;
	int flags() default 0;
}
