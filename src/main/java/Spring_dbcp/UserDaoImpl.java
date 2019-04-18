package Spring_dbcp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component("userDao1")
public class UserDaoImpl implements UserDao {

    private  JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insertUser(User user) {
      String sql="insert into t_user(account,password) values(?,?)";
      Object[] obj=new Object[]{
             user.getAccount(),
             user.getPassword()
      };
        int n=this.jdbcTemplate.update(sql,obj);
        return  n;
    }

    @Override
    public int updateUser() {
        String sql="update t_user set account = 'titi' where account = ?  ";
        int n=this.jdbcTemplate.update(sql,"CHENGZHE");
        return n;
    }

    @Override
    public int delUser() {
        String sql=" delete from t_user where account= 'chengzhe' ";
        int n=this.jdbcTemplate.update(sql);
        return n;
    }

    @Override
    public int delUserById(int id) {
        String sql=" delete from t_user where id=? ";
        int n=this.jdbcTemplate.update(sql);
        return n;
    }



}
