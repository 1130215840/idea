package aop_test;

public class UserServiceImpl implements UserService {
       private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUser(String username, String password) {
        userDao.addUser(username,password);
    }

    @Override
    public void delUser(int id) {
       userDao.delUser(id);
       throw new RuntimeException("这是特意抛出的异常信息");
    }
}
