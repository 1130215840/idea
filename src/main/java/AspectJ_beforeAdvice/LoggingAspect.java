package AspectJ_beforeAdvice;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component   //把这个类声明成一个切面，需要把该类加入Ioc 容器中
@Aspect      //声明该类为一个切面
public class LoggingAspect {

     private Logger logger= LogManager.getLogger(LoggingAspect.class);

     //声明before()是一个前置通知，在add()执行之前执行
     @Before("execution(int AspectJ_beforeAdvice.JiSuanQiImpl.*(int,int) )")
    public void before(JoinPoint joinPoint){
         String methodName=joinPoint.getSignature().getName();
         List<Object> args = Arrays.asList(joinPoint.getArgs());
         logger.info("The method " + methodName + "()  begins with " + args);
     }
     //后置通知  在目标方法执行后（无论是否发生异常）执行
    @After("execution(int AspectJ_beforeAdvice.JiSuanQiImpl.*(int,int))")
    public void afterMethod(JoinPoint joinPoint){
         String methodName=joinPoint.getSignature().getName();
         logger.info("The method " + methodName  + "()  ends");
       }

}

