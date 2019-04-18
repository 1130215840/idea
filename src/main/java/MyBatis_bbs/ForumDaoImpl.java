package MyBatis_bbs;

import org.apache.ibatis.session.SqlSession;
import java.util.List;

public class ForumDaoImpl implements ForumDao {

    SqlSession sqlSession;

    @Override
    public int insertForum(Forum forum) {
        sqlSession=MybatisUtils.getSession();
        int result=sqlSession.insert("insertForum",forum);
        sqlSession.commit();
        sqlSession.close();
        return result;
    }

    @Override
    public List<Forum> getAllForums() {
        sqlSession=MybatisUtils.getSession();

        return null;
    }

    @Override
    public void batchInsert(List<Forum> forums) {

    }
}
