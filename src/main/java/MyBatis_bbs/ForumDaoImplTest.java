package MyBatis_bbs;

import org.junit.jupiter.api.Test;

class ForumDaoImplTest {

   ForumDao forumDao=new ForumDaoImpl();

    @Test
    void insertForum() {
        Forum forum=new Forum();
        forum.setForum_id(3);
        forum.setForum_name("huaweiluntan");
        int result=forumDao.insertForum(forum);
    }

    @Test
    void getAllForums() {
    }

    @Test
    void batchInsert() {
    }
}