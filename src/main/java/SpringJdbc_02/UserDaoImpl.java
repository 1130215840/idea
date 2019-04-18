package SpringJdbc_02;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.util.List;

@Component
public class UserDaoImpl implements UserDao {

    private  JdbcTemplate jdbcTemplate;

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
        String sql="update t_user set account = 'chengzhe' where account=?  ";
        int n=this.jdbcTemplate.update(sql,"titi");
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

    @Override
    public List<User> chaxun() {
        String sql=" select account,password from t_user";
        RowMapper rowMapper=new BeanPropertyRowMapper(User.class);
        List<User> list=this.jdbcTemplate.query(sql,rowMapper);
        return  list;
    }


}
