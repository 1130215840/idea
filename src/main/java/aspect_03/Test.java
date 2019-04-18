package aspect_03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("aspect_03/aspect_03_beans.xml");
        UserDao userDao=(UserDao)ac.getBean("userDao");
        User user=new User("Tom","123");
        userDao.insertUser(user);
    }
}
