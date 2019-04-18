package SpringJdbc_02;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component("myAspect")
@Aspect
public class MyAspect {

    @Before("execution(* SpringJdbc_02.UserDaoImpl.*(..))")
    public void beforeMethod(JoinPoint joinPoint){
        String methodName=joinPoint.getSignature().getName();
        System.out.println(methodName + "方法正在执行...");
    }

    @After("execution(* SpringJdbc_02.UserDaoImpl.*(..))")
    public void afterMethod(JoinPoint joinPoint){
        String methodName=joinPoint.getSignature().getName();
        System.out.println(methodName + "方法执行完毕...");
    }

}
