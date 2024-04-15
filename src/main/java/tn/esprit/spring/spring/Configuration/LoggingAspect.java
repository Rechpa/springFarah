package tn.esprit.spring.spring.Configuration;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class LoggingAspect {

    @Before("execution(* tn.esprit.spring.spring.ServiceImpl.*.*(..))")
    public void logMethodEntryBefore(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("In method " + name + " : ");
    }
    @After("execution(* tn.esprit.spring.spring.ServiceImpl.*.*(..))")
    public void logMethodEntryAfter(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("In method " + name + " : ");
    }
    @AfterThrowing("execution(* tn.esprit.spring.spring.ServiceImpl.*.*(..))")
    public void logMethodEntryAfterTH(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("In method " + name + " : ");
    }

    @AfterReturning("execution(* tn.esprit.spring.spring.ServiceImpl.*.*(..))")
    public void logMethodEntryAfterRT(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("In method " + name + " : ");
    }


}
