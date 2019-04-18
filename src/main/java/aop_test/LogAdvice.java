package aop_test;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class LogAdvice implements MethodBeforeAdvice {
    //日志记录器
    private Logger logger= LogManager.getLogger(LogAroundAdvice.class);

    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        String targetClassName=o.getClass().getName();
        String targetMethodName=method.getName();
        String logInfoText="前置通知"+targetClassName+"类的"+targetMethodName+"方法开始执行";
        logger.info(logInfoText);
    }
}
