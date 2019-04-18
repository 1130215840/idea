package mybatis_spring.Dao;

import mybatis_spring.PO.Forum;

import java.util.List;

public interface ForumDao {

    int insertForum(Forum forum);

    int deleteForum(int forum_id);

    int updateForum(Forum forum);

    List<Forum> getAllForums();

}
