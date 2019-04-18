package OneToOne;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;



class TestTest {

    @Test
    public void findPersonByPidTest(){
        SqlSession session=MybatisUtil.getSession();
        Person person=session.selectOne("PersonMapper.findPersonByPid",2);
        System.out.println(person);
        session.close();
    }

    @Test
    public void findPersonByPid2Test(){
        SqlSession session=MybatisUtil.getSession();
        Person person=session.selectOne("PersonMapper.findPersonByPid2",1);
        System.out.println(person);
        session.close();
    }

}