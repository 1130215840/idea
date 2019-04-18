package aspect_04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("aspect_04/aspect_04_beans.xml");
        UserDao userDao= (UserDao) ac.getBean("userDaoImpl1");
        userDao.addUser();
        userDao.delUser();
    }
}
