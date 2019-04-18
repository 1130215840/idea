package aop_test;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

public class ThrowsLogAdvice implements ThrowsAdvice {
     private Logger logger= LogManager.getLogger(ThrowsAdvice.class);

    public void afterThrowing(Method method, Object[] args, Object
            target, Throwable exeptionClass){
      String targetName=target.getClass().getName();
      String targetMethodName=method.getName();
      String longInfoText="异常通知:"+"执行"+targetName+"类"+targetMethodName+"方法时发生异常";
      logger.info(longInfoText);
    }

}
