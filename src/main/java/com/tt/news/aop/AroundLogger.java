package com.tt.news.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Arrays;

/**
 * @Auther: xyf
 * @Date: 2018/9/25 11:47
 * @Description:
 */
@Aspect
public class AroundLogger {
    private static final Logger log = Logger.getLogger(AroundLogger.class);

//    @Around("execution(* com.tt.service.provider.ProviderService.*(..))")
    @Around("execution(* com.tt.news.service..*.*(..))") //service包及其子包下所有类的所有方法
//    @Around("execution(* com.tt.service.*.*(..))") //service包下所有类的所有方法
    public Object aroundLogger(ProceedingJoinPoint jp) throws Throwable {
        log.info("调用 " + jp.getTarget() + " 的 " + jp.getSignature().getName()
                + " 方法。方法入参：" + Arrays.toString(jp.getArgs()));
        try {
            Object result = jp.proceed();
            log.info("调用 " + jp.getTarget() + " 的 "
                    + jp.getSignature().getName() + " 方法。方法返回值：" + result);
            return result;
        } catch (Throwable e) {
            log.error(jp.getSignature().getName() + " 方法发生异常：" + e);
            throw e;
        } finally {
            log.info(jp.getSignature().getName() + " 方法结束执行。");
        }
    }
}
