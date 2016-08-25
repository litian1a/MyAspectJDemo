package com.example.litiancheng.myaspectjdemo;

import android.util.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;

import java.util.Objects;

/**
 * Created by litiancheng on 2016/8/14.
 */
//log切面
    @Aspect
public class LogAspectJ {
    private static final String TAG = "Log";

    //切点  (切带有LogTrace注解地方的方法)
    @Pointcut("execution(@com.example.litiancheng.myaspectjdemo.LogTrace * *(..))")
    public void annoLogTrace(){




    }

    /**
     * before 在方法运行前
     * after  在方法运行后
     * around 切割方法 更灵活可以在方法前后插入
     * @param joinPoint
     */
    @Before("annoLogTrace()")
    public  void showLog(JoinPoint joinPoint){

        Log.i(TAG, "showLog: "+joinPoint.toShortString());
    }

//    @Around("annoLogTrace()")
//  public Object showLog(ProceedingJoinPoint joinPoint) throws Throwable {
//    //方法执行前
//        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
//        LogTrace annotation = signature.getMethod().getAnnotation(LogTrace.class);
//        String value = annotation.value();
//        Log.i(TAG, "startLog: "+value);
//
//        //方法执行中
//        Object proceed = joinPoint.proceed();
//
//        //方法执行后
//        Log.i(TAG, "endLog: "+value);
//return  proceed;
//
//    }
}
