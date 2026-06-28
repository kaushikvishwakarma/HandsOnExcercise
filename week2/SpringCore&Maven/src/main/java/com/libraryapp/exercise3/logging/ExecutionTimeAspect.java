package com.libraryapp.exercise3.logging;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExecutionTimeAspect {

    @Around("execution(* com.libraryapp.exercise3.logging.LibraryPerformanceService.*(..))")
    public Object measureTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.nanoTime();
        Object result = joinPoint.proceed();
        long elapsedTime = System.nanoTime() - startTime;
        System.out.println(joinPoint.getSignature().getName() + " took " + elapsedTime + " ns");
        return result;
    }
}