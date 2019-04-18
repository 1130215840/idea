package Spring_dbcp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.junit.jupiter.api.Test;

@ContextConfiguration({"classpath:Spring_dbcp01/Spring_dbcp01.xml"})


public class UserDaoImplTest {

    @Autowired
    private UserDao userDao;

    @Test
    private void insertUser() {
       User user=new User("tt","1234566");
       int n=userDao.insertUser(user);

    }
}