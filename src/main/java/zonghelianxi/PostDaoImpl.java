package zonghelianxi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("postDao1")
public class PostDaoImpl implements PostDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insertPost(Post post) {
        String sql="insert into t_post(post_id,forum_id,title,content,thumbnail) values(?,?,?,?,?)";
        Object[] obj=new Object[]{
                post.getPost_id(),
                post.getForum_id(),
                post.getTitle(),
                post.getContent(),
                post.getThumbnail()
        };
        int n=this.jdbcTemplate.update(sql,obj);
        return n;
    }

    @Override
    public int delPost(int post_id) {
        String sql="delete from t_post where post_id = ?";
        int n=this.jdbcTemplate.update(sql,post_id);
        return n;
    }

    @Override
    public int updatePost(Post post) {
        String sql="update t_post set title = ? where post_id = ?";
        int n=this.jdbcTemplate.update(sql,post.getTitle(),post.getPost_id());
        return n;
    }

    @Override
    public List<Post> getPostsByForumId(int forum_id) {
          String sql="select * from t_post where forum_id=?";
          RowMapper rowMapper=new BeanPropertyRowMapper(Post.class);
          List<Post> list=this.jdbcTemplate.query(sql,rowMapper,forum_id);
        return list;
    }

    @Override
    public int getCountByForumId(int forum_id) throws Exception {
        String sql="select count(*) from t_post where forum_id=?";
       int count=0;
       return  count;
    }
}
