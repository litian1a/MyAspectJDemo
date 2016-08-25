package com.example.litiancheng.myaspectjdemo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by litiancheng on 2016/8/14.
 */
//使用在方法上
@Target(ElementType.METHOD)
//存在于运行期
@Retention(RetentionPolicy.RUNTIME)
public @interface LogTrace {

    String value();
}
