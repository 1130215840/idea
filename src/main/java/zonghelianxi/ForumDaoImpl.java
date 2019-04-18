package zonghelianxi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("forumDao1")
public class ForumDaoImpl implements ForumDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insertForum(Forum forum) {
        String sql="insert into t_forum(forum_id,forum_name) values (?,?)";
        Object[] obj=new Object[]{
                forum.getForum_id(),
                forum.getForum_name(),
        };
        int n = this.jdbcTemplate.update(sql,obj);
        return n;
    }

    @Override
    public List<Forum> getAllForums() {
        String sql="select * from t_forum";
        RowMapper rowMapper=new BeanPropertyRowMapper(Forum.class);
        List<Forum> list=this.jdbcTemplate.query(sql,rowMapper);
        return list;
    }

    @Override
    public void batchInsert(List<Forum> forums) {

    }
}
