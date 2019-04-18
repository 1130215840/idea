package OneToOne;

import org.apache.ibatis.session.SqlSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonDaoImpl implements PersonDao {

    SqlSession session;

    @Override
    public int insertPerson(Person person) {
        session=MybatisUtil.getSession();
        int n=session.insert("insertPerson",person);
        session.commit();
        session.close();
        return n;
    }

    @Override
    public int delPersonByPid(int p_id) {
        session=MybatisUtil.getSession();
        int n=session.delete("delPersonByPid",p_id);
        session.commit();
        session.close();
        return n;
    }

    @Override
    public Person findPersonByPid3(int p_id) {
        session=MybatisUtil.getSession();
        Person person=session.selectOne("findPersonByPid3",p_id);
        session.commit();
        session.close();
        return person;
    }

    @Override
    public List<Person> selectAllPerson() {
        session=MybatisUtil.getSession();
        List<Person> personList=session.selectList("selectAllPerson");
        session.commit();
        session.close();
        return personList;
    }

    @Override
    public int updatePerson(Person person) {
        session=MybatisUtil.getSession();
        int n=session.update("updatePerson",person);
        session.commit();
        session.close();
        return n;
    }

    @Override
    public Map getPersonInfo(int p_id) {
        Map<String,Integer> map1=new HashMap<String,Integer>();
        map1.put("p_id",p_id);
        session=MybatisUtil.getSession();
        Map<Integer,Person> map=session.selectMap("getPersonInfo",map1,"p_id");
        session.commit();
        session.close();
        return map;
    }
}
