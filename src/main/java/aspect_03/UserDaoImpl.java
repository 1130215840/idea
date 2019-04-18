package aspect_03;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("userDao")  //将本类标注为一个DAO组件
public class UserDaoImpl implements UserDao {

    @Override
    public int insertUser(User user) {

         JdbcTemplate jdbcTemplate;

        System.out.println("添加用户"+user.getAccount());
        //  为出现异常
        //  int i=10/0;
        return 0;
    }

}
