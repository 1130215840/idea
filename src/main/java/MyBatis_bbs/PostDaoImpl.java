package MyBatis_bbs;

import org.apache.ibatis.session.SqlSession;
import java.util.List;


public class PostDaoImpl implements PostDao {

    SqlSession session;

    @Override
    public int insertPost(Post post) {
        session=MybatisUtils.getSession();
        int n=session.insert("PostMapper.insertPost",post);
        session.commit();
        session.close();
        return n;
    }

    @Override
    public int delPost(int post_id) {
        return 0;
    }

    @Override
    public List<Post> getPostsByForumIdAndTitle(Post post) {
        session=MybatisUtils.getSession();
        List<Post> list=session.selectList("PostMapper.getPostsByForumIdAndTitle",post);
        session.commit();
        session.close();
        return list;
    }

    @Override
    public List<Post> getPostsByTitleAndContent(Post post) {
        session=MybatisUtils.getSession();
        List<Post> posts=session.selectList("byTitleAndContentLike",post);
        session.commit();
        session.close();
        return posts;
    }

    @Override
    public int updatePost(Post post) {
        session=MybatisUtils.getSession();
        int n=session.update("PostMapper.updatePost",post);
        session.commit();
        session.close();
        return n;
    }

    @Override
    public List<Post> getPostsByForumId(int forum_id) {
        return null;
    }

    @Override
    public int getCountByForumId(int forum_id) throws Exception {
        return 0;
    }

    @Override
    public List<Post> getPostsByPostIds(List<Integer> ids) {
        session=MybatisUtils.getSession();
        List<Post> posts=session.selectList("byPostIds",ids);
        session.commit();
        session.close();
        return posts;
    }


    @Override
    public List<Post> getPostsByContent(Post post) {
        session=MybatisUtils.getSession();
        Post post1=new Post();
        post1.setContent("aa");
        List<Post> posts=session.selectList("byContentLike",post1);
        session.commit();
        session.close();
        return posts;
    }
}
