package OneToMore.Test;

import OneToMore.POJO.User;
import OneToOne.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

class Test1 {

    @Test
    public void testFindUser(){
        SqlSession session= MybatisUtil.getSession();
        User user=session.selectOne("findUserAndOrders",1);
        System.out.println(user);
    }

    @Test
    public void testFindUser2(){
        SqlSession session= MybatisUtil.getSession();
        User user=session.selectOne("findUserById",1);
        System.out.println(user);
    }
}
