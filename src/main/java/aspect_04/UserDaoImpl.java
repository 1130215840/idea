package aspect_04;

import org.springframework.stereotype.Component;

@Component("userDaoImpl1")
public class UserDaoImpl implements UserDao {
    @Override
    public void addUser() {
        System.out.println("增加用户");
    }

    @Override
    public void delUser() {
        int j=1/0;
        System.out.println("删除用户");
    }
}
