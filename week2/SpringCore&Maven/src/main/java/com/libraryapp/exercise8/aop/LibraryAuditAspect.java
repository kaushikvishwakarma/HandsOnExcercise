package com.libraryapp.exercise8.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LibraryAuditAspect {

    @Before("execution(* com.libraryapp.exercise8.aop.LibraryTransactionService.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("Starting " + joinPoint.getSignature().getName());
    }

    @AfterReturning(pointcut = "execution(* com.libraryapp.exercise8.aop.LibraryTransactionService.*(..))", returning = "result")
    public void logAfterSuccess(JoinPoint joinPoint, Object result) {
        System.out.println("Completed " + joinPoint.getSignature().getName() + " with " + result);
    }

    @AfterThrowing(pointcut = "execution(* com.libraryapp.exercise8.aop.LibraryTransactionService.*(..))", throwing = "error")
    public void logAfterFailure(JoinPoint joinPoint, Throwable error) {
        System.out.println("Failed " + joinPoint.getSignature().getName() + " because " + error.getMessage());
    }

    @Around("execution(* com.libraryapp.exercise8.aop.LibraryTransactionService.*(..))")
    public Object trackExecution(ProceedingJoinPoint joinPoint) throws Throwable {
        long startedAt = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long duration = System.currentTimeMillis() - startedAt;
        System.out.println(joinPoint.getSignature().getName() + " finished in " + duration + " ms");
        return result;
    }
}