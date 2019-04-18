package aspect_03;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAdvice {

        private Logger logger= LogManager.getLogger(UserDaoImpl.class);

        //切点 对UserDaoImpl 的所有方法
    @Pointcut("execution(int aspect_03.UserDaoImpl.*(..))")
     public void pc(){

    }

    //前置增强 并指定切点
    @Before("MyAdvice.pc()")
    public void before(){
        logger.info("等待新用户的添加...");
    }

    //后置增强 并指定切点 出现异常不会调用
    @AfterReturning("execution(* aspect_03.UserDaoImpl.*(..))")
    public void afterReturning(){
        logger.info("用户添加完成...");
    }

   //异常增强
    @AfterThrowing("execution(* aspect_03.UserDaoImpl.*(..))")
    public void yichang(){
        logger.info("出现异常...");
    }


}
