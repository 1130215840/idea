package mybatis_spring.Mapper;

import mybatis_spring.PO.Forum;

import java.util.List;

public interface ForumMapper {

    public void insertForum(Forum forum);

    public void deleteForumById(int forum_id);

    public void updateForum(Forum forum);

    public List<Forum> getAllForums();

}
