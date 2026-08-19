/**
 * All Rights Reserved, Copyright(c) 2026 Fujitsu Learning Media Limited
 *
 */
package com.example.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ItemServiceLoggingAspect {

    private static final Logger log = LoggerFactory.getLogger(ItemServiceLoggingAspect.class);

    // Service層の全メソッド（ItemServiceImpl の全メソッド）を対象にする
    // ロギングメソッドの詳細はItemRestControllerLoggingAspect.javaのコメント参照

    @Before("execution(* com.example.service.ItemServiceImpl.*(..))")
    public void beforeService(JoinPoint jp) {
        // TO DO
    }

    @AfterReturning(
            value = "execution(* com.example.service.ItemServiceImpl.*(..))",
            returning = "result"
    )
    public void afterService(JoinPoint jp, Object result) {
        // TO DO
    }
}
