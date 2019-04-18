package aspect_04;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect

public class ExceptionAspect {

    @Around("execution(* aspect_04.UserDaoImpl.*(..))")
     public Object myAround(ProceedingJoinPoint proceedingJoinPoint){
       try{
          return  proceedingJoinPoint.proceed();
       }catch (Throwable e) {
           ExceptionInfo exceptionInfo = new ExceptionInfo();
           String className = proceedingJoinPoint.getTarget().getClass().getName();
           exceptionInfo.setClassName(className);
           String methodName = proceedingJoinPoint.getSignature().getName();
           exceptionInfo.setMethodName(methodName);
           exceptionInfo.setMessage(e.toString());
           ExceptionUtils.report(exceptionInfo);
       }
        return null;

   }


}
