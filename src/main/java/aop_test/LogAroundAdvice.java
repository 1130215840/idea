package aop_test;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class LogAroundAdvice implements MethodInterceptor {
    private Logger logger= LogManager.getLogger(LogAroundAdvice.class);
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        long begginTime=System.currentTimeMillis();
        logger.info("环绕通知："+methodInvocation.getMethod().getName()+"方法调用前时间："+begginTime+"毫秒");
        methodInvocation.proceed();
        long endTime=System.currentTimeMillis();
        String targetMethodName=methodInvocation.getMethod().getName();
        String logInfoText="环绕通知:"+targetMethodName+"方法调用后时间"+endTime+"毫秒";
        logger.info(logInfoText);
        return null;
    }
}
