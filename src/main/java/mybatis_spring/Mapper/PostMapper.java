package mybatis_spring.Mapper;

import mybatis_spring.PO.Post;

import java.util.List;

public interface PostMapper {

     void insertPost(Post post);

     void delPost(int post_id);

     List<Post> getPostsByForumIdAndTitle(Post post);

     List<Post> getPostsByTitleAndContent(Post post);

     void updatePost(Post post);

     List<Post> getPostsByForumId(int forum_id);

     int getCountByForumId(int forum_id) throws Exception;

     List<Post> getPostsByPostIds(List<Integer> ids);



}
