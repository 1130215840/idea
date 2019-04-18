package SpringJdbc_02;

import java.util.List;

public interface UserDao {
    int insertUser(User user);
    int updateUser();
    int delUser();
    int delUserById(int id);
    List<User> chaxun();
}

