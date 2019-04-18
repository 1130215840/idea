package mybatis_spring.Test;

import mybatis_spring.Mapper.PostMapper;
import mybatis_spring.PO.Post;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.ArrayList;
import java.util.List;

public class PostMapperTest {

    ApplicationContext ac=new ClassPathXmlApplicationContext("/spring_mybatis/mybatis-spring_application.xml");
    PostMapper postMapper=(PostMapper)ac.getBean("postMapper1");

    @Test
    public void insertPostTest(){
        Post post=new Post();
        post.setForum_id(1);
        post.setTitle("spring-mybatis");
        post.setContent("come on!");
        postMapper.insertPost(post);
    }

    @Test
    public void deletePostTest(){
       postMapper.delPost(5);
    }

    @Test
    public void getPostsByForumIdAndTitleTest(){
        Post post=new Post();
        post.setForum_id(1);
        List<Post> postList=postMapper.getPostsByForumIdAndTitle(post);
        for(Post p:postList){
           System.out.println(p);
       }
    }

    @Test
    public void getPostsByTitleAndContentTest(){
        Post post=new Post();
        post.setContent("come");
        List<Post> postList=postMapper.getPostsByTitleAndContent(post);
        for(Post p:postList){
            System.out.println(p);
        }
    }

    @Test
    public void updatePostTest(){
        Post post=new Post();
        post.setPost_id(4);
        post.setTitle("spring-mybatis");
        post.setContent("Come on!");
        postMapper.updatePost(post);
    }

    @Test
    public void getPostsByForumIdTest(){
       List<Post> postList=postMapper.getPostsByForumId(1);
        for(Post p:postList){
            System.out.println(p);
        }
    }

    @Test
    public void getCountByForumIdTest(){
        try {
            int n=postMapper.getCountByForumId(1);
            System.out.println(n);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getPostsByPostIds() {
        List<Integer> ids = new ArrayList<>();
        ids.add(1);
        ids.add(3);
        ids.add(6);
        List<Post> posts=postMapper.getPostsByPostIds(ids);
        for (Post p:posts) {
            System.out.println(p);
        }
    }
}