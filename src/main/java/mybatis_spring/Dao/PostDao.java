package mybatis_spring.Dao;

import mybatis_spring.PO.Post;

import java.util.List;

public interface PostDao {

    int insertPost(Post post);

    int delPost(int post_id);

     List<Post> getPostsByForumIdAndTitle(Post post);

     List<Post> getPostsByTitleAndContent(Post post);

    int updatePost(Post post);

    List<Post> getPostsByForumId(int forum_id);

    int getCountByForumId(int forum_id) throws Exception;

    List<Post> getPostsByPostIds(List<Integer> ids);

    List<Post> getPostsByContent(Post post);




}
