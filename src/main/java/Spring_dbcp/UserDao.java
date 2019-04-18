package Spring_dbcp;

public interface UserDao {
    int insertUser(User user);
    int updateUser();
    int delUser();
    int delUserById(int id);
}

