package aspect_01;

public class UserDaoImpl implements UserDao {
    @Override
    public void addUser() {
        System.out.println("增加用户");
    }

    @Override
    public void delUser() {
        System.out.println("删除用户");
    }
}
