package Spring_dbcp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext ac=new ClassPathXmlApplicationContext("Spring_dbcp01/Spring_dbcp01.xml");
        UserDao userDao=(UserDao)ac.getBean("userDao1");
        User user1=new User("CHENGZHE","123");
        User user2=new User("titi","111");
        //userDao.insertUser(user1);
        //userDao.insertUser(user2);
        userDao.updateUser();


    }
}
