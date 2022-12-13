package com.example.admin.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import javax.servlet.http.HttpSession;
import java.util.logging.Logger;

@Slf4j
@Component
@Aspect
public class AdminAOP {

    @Pointcut(" execution (* com.example.admin.controller.*.*(..))")
    public void cut(){}

    @Around("cut() && !@annotation(com.example.admin.aop.SkipChecking)")//어떤 포인트컷에 어라운드를 해서 실행시킬 것인가/로직을 적는 구간
    public Object around(ProceedingJoinPoint joinPoint)throws Throwable{
        HttpSession session = ((ServletRequestAttributes)RequestContextHolder.currentRequestAttributes()).getRequest().getSession();
        if(session.getAttribute("id") == null){//로그인을 안 했을 때
            Object[] arr = joinPoint.getArgs();
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i].toString());
            }
            System.out.println(joinPoint.getSignature().getDeclaringTypeName());
            System.out.println(joinPoint.getTarget());
            System.out.println(joinPoint.getThis());
            System.out.println(joinPoint.getKind());
            System.out.println(joinPoint.getClass());
            System.out.println(joinPoint.toLongString());
            System.out.println(joinPoint.toShortString());
            System.out.println(joinPoint.getSignature().toLongString());
            return null;
        } else {
            return joinPoint.proceed();
        }
    }






}
