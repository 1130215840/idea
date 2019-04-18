package aop_test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("/aop_test/beans.xml");
        UserService userService= (UserService) ac.getBean("userProxy");
        userService.addUser("李四","123");
        System.out.println("*******");
        userService.delUser(1);
    }
}
