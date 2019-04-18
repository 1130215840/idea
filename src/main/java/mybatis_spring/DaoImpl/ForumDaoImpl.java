package mybatis_spring.DaoImpl;

import mybatis_spring.Dao.ForumDao;
import mybatis_spring.PO.Forum;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class ForumDaoImpl extends SqlSessionDaoSupport implements ForumDao {

    @Override
    public int insertForum(Forum forum) {
        SqlSession sqlSession=this.getSqlSession();
        int n=sqlSession.insert("t.insertForum",forum);
        return n;
    }

    @Override
    public int deleteForum(int forum_id) {
        return 0;
    }

    @Override
    public int updateForum(Forum forum) {
        return 0;
    }

    @Override
    public List<Forum> getAllForums() {
        return null;
    }
}
