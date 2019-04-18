package aspect_04;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Aspect
public class TimeAspect {

      @Around("execution(* aspect_04.UserDaoImpl.*(..))")
       public Object aroundMethod(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
          MonitorTime monitorTime=new MonitorTime();
          String methodName=proceedingJoinPoint.getSignature().getName(); //获得方法名
          monitorTime.setMethodName(methodName);
          long start=System.currentTimeMillis();
          Object obj=proceedingJoinPoint.proceed(); //执行目标方法
          long time=System.currentTimeMillis()-start;  //计算时间
          monitorTime.setComsumeTime(time);
          monitorTime.setLogTime(new Date());
          MonitorUtils.report(monitorTime);
          return  obj;
      }


}

