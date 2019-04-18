package MyBatis_bbs;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PostDaoImplTest {

    PostDao postDao=new PostDaoImpl();

    @Test
    void insertPost() {
        Post post=new Post();
        post.setForum_id(2);
        post.setTitle("cc");
        post.setContent("cccc");
        int n=postDao.insertPost(post);
        assertEquals(1,n);
    }

    @Test
    void delPost() {
    }

    @Test
    void updatePost() {
        Post post=new Post();
        post.setPost_id(2);
        post.setTitle("bb");
        post.setContent("bbbbb");
        postDao.updatePost(post);
    }

    @Test
    void getPostsByForumId() {
    }

    @Test
    void getCountByForumId() {
    }

    @Test
    void getPostsByForumIdAndTitle() {
        Post post=new Post();
        post.setPost_id(3);
        List<Post> posts=postDao.getPostsByForumIdAndTitle(post);
        for (Post p:posts) {
            System.out.println(p);
        }
    }

    @Test
    void getPostsByTitleAndContent() {
        Post post=new Post();
        post.setContent("a");
        List<Post> posts=postDao.getPostsByTitleAndContent(post);
        for (Post p:posts) {
            System.out.println(p);
        }
    }

    @Test
    void getPostsByPostIds() {
        List<Integer> ids = new ArrayList<>();
        ids.add(1);
        ids.add(3);
        ids.add(5);
        List<Post> posts=postDao.getPostsByPostIds(ids);
        for (Post p:posts) {
            System.out.println(p);
        }
    }

    @Test
    void getPostsByContent() {
    }
}