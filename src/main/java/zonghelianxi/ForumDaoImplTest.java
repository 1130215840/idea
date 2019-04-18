package zonghelianxi;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ForumDaoImplTest {

    ApplicationContext ac=new ClassPathXmlApplicationContext("zonghelianxi/zonghe_beans.xml");
    ForumDao forumDao=(ForumDao)ac.getBean("forumDao1");

    @Test
    void insertForum() {
      Forum forum=new Forum();
      forum.setForum_name("baiduluntan");
      int n=forumDao.insertForum(forum);
      assertEquals(1,n);
    }

    @Test
    void getAllForums() {
       List<Forum> list1=forumDao.getAllForums();
       for (Forum forum:list1){
           System.out.print("id:" + forum.getForum_id());
           System.out.println(",name:" + forum.getForum_name());
       }
    }

    @Test
    void batchInsert() {
    }
}