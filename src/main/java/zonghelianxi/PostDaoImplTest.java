package zonghelianxi;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

class PostDaoImplTest {

    ApplicationContext ac=new ClassPathXmlApplicationContext("zonghelianxi/zonghe_beans.xml");
    PostDao postDao=(PostDao)ac.getBean("postDao1");


    @Test
    void insertPost() {
        Post post=new Post();
        post.setPost_id(1);
        post.setForum_id(1);
        post.setTitle("aa");
        post.setContent("aaaaaaa");
        postDao.insertPost(post);
    }

    @Test
    void delPost() {
        postDao.delPost(1);
    }

    @Test
    void updatePost() {
        Post post1=new Post();
        post1.setPost_id(2);

    }

    @Test
    void getPostsByForumId() {
        List<Post> list=postDao.getPostsByForumId(1);
        for(Post post:list){
            System.out.println(post);
        }
    }

    @Test
    void getCountByForumId() throws Exception {
        int count=postDao.getCountByForumId(1);
        System.out.println(count);
    }
}