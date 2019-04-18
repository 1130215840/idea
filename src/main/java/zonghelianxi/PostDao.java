package zonghelianxi;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PostDao {

    int insertPost(Post post);

    int delPost(int post_id);

    int updatePost(Post post);

    List<Post> getPostsByForumId(int forum_id);

    int getCountByForumId(int forum_id) throws Exception;




}
