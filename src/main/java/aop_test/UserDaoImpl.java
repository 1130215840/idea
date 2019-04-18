package aop_test;

public class UserDaoImpl implements UserDao {
    @Override
    public void addUser(String username, String password) {
        System.out.println(username+"添加成功");
    }

    @Override
    public void delUser(int id) {
        System.out.println("编号为"+id+"的用户已删除");
    }


}
