package aop_test;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AfterAdvice implements AfterReturningAdvice {
    private Logger logger= LogManager.getLogger(LogAroundAdvice.class);
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        String targetClassName=o1.getClass().getName();
        String targetMethodName=method.getName();
        String logInfoText="后置通知"+targetClassName+"类的"+targetMethodName+"方法开始执行";
        logger.info(logInfoText);
    }
}
