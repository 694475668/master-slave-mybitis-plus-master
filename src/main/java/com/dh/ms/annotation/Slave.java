package com.dh.ms.annotation;


import java.lang.annotation.*;

/**
 * @author 刘明
 */
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface Slave {
}
