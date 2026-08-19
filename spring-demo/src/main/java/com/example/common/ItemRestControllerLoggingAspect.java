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
public class ItemRestControllerLoggingAspect {

    private static final Logger log = LoggerFactory.getLogger(ItemRestControllerLoggingAspect.class);
    // RestController層の検索系メソッド（ItemRestController のfind* メソッド）を対象にする
    @Before("") // TO DO
    // どのメソッドを対象にするか : execution(* パッケージ.クラス.メソッド(..))
    // find* : 「find」で始まるメソッド名がすべて対象となる
    // (..) : 引数は何でもOK

    public void beforeController(JoinPoint jp) {
        log.debug("[AOP] START: {}", jp.getSignature());
        // {} : プレースホルダ。2番目の引数の値(メソッドシグニチャ)がここに入る
    }

    @AfterReturning(
            value = "", // TO DO
            returning = "result"
    )
    // returning = "result" : 対象メソッドの戻り値をresultという変数名で
    // afterController()に渡すことを表す(→一致させる必要がある)

    public void afterController(JoinPoint jp, Object result) {
        log.debug("[AOP] END: {} -> {}", jp.getSignature(), result);
        // {} : プレースホルダ。2番目の引数の値(メソッドシグニチャ)、
        // 3目の引数の値(findById()などの戻り値)がここに入る
    }

    //--------------------------------------
    // ロギング関連のアノテーション
    //
    // @Before : メソッドの「前」
    // @AfterReturning :	正常終了の「後」
    // @AfterThrowing : 例外が出た「後」
    // @After : 正常でも例外でも「必ず後」
    // @Around : 前後＋例外＋戻り値すべて
    //--------------------------------------
}
