package au.com.onik.interceptor;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Authenticator {

    @Around("execution(* au.com.onik.controllers.UserController.*(..))")
    public Object intercept(ProceedingJoinPoint joinPoint) throws Throwable {
        return joinPoint.proceed();
    }
}
