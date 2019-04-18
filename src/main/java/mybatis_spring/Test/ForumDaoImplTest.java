package mybatis_spring.Test;

import mybatis_spring.Dao.ForumDao;
import mybatis_spring.PO.Forum;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class ForumDaoImplTest {

    private ApplicationContext ac;

   //  在这个方法中得到spring容器
  @BeforeEach
  void setUp() {
      ac=new ClassPathXmlApplicationContext("spring_mybatis/mybatis-spring_application.xml");
   }

    @Test
    void insertForum() {
        Forum forum=new Forum();
        forum.setForum_name("pingguoluntan");
        ForumDao forumDao=(ForumDao)ac.getBean("forumDao1");
        forumDao.insertForum(forum);
    }

    @Test
    void deleteForum() {
    }

    @Test
    void updateForum() {
    }

    @Test
    void getAllForums() {

    }


}