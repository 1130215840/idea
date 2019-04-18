package aspect_01;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestXmlAspect {
    public static void main(String[] args) {
        String xmlPath= "aspect_01/aspect_01_beans.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(xmlPath);
        UserDao userDao= (UserDao) ac.getBean("userDao");
        userDao.addUser();
        System.out.println("******");
        userDao.delUser();
    }
}
