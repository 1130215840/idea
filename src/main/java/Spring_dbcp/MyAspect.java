package Spring_dbcp;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component("myAspect")
@Aspect
public class MyAspect {

    @Before("execution(* Spring_dbcp.UserDaoImpl.*(..))")
    public void beforeMethod(){
        System.out.println("等待用户添加！");
    }

    @After("execution(int Spring_dbcp.UserDaoImpl.insertUser(..))")
    public void afterMethod(){
        System.out.println("用户添加完成！");
    }

}
