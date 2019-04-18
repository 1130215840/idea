package mybatis_spring.Test;

import mybatis_spring.Mapper.ForumMapper;
import mybatis_spring.PO.Forum;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.junit.Assert.*;

public class ForumMapperTest {

    ApplicationContext ac=new ClassPathXmlApplicationContext("spring_mybatis/mybatis-spring_application.xml");
    ForumMapper forumMapper=(ForumMapper)ac.getBean("forumMapper2");

    @Test
    public void insertForumTest(){
        Forum forum=new Forum();
        forum.setForum_name("vivoluntan");
        forumMapper.insertForum(forum);
    }

    @Test
    public void deleteForumById(){
        forumMapper.deleteForumById(11);
    };

    @Test
    public void updateForum(){
        Forum forum=new Forum();
        forum.setForum_id(10);
        forum.setForum_name("phoneluntan");
        forumMapper.updateForum(forum);
    };

    @Test
    public void getAllForums(){
        List<Forum> forumlist=forumMapper.getAllForums();
        for(Forum f:forumlist){
            System.out.println(f);
        }
    };
}