package zonghelianxi;

import java.util.List;

public interface ForumDao {

    int insertForum(Forum forum);

    List<Forum> getAllForums();

    void batchInsert(List<Forum> forums);

}
