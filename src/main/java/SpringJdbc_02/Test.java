package SpringJdbc_02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("SpringJdbc_02/SpringJdbc_02_beans.xml");
        UserDao userDao=(UserDao)ac.getBean("userDao1");
        //User user1=new User("chengzhe","123");
        //User user2=new User("titi","123456789");
        // userDao.insertUser(user1);
        // userDao.insertUser(user2);
        //userDao.updateUser();
        //userDao.delUser();
        //userDao.delUserById(13);
       //userDao.updateUser();
       List<User> list1=userDao.chaxun();
       for (User user:list1){
           System.out.print("id:" + user.getId());
           System.out.print(",account:" + user.getAccount());
           System.out.println(",password:" + user.getPassword());
       }

    }
}
