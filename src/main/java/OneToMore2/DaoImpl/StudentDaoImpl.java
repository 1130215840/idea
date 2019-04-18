package OneToMore2.DaoImpl;

import OneToMore2.Dao.StudentDao;
import OneToMore2.POJO.Student;
import OneToMore2.Utils.MybatisUtil2;
import org.apache.ibatis.session.SqlSession;

public class StudentDaoImpl implements StudentDao {

    SqlSession session;

    @Override
    public Student findStudentByIdCard(int idCard) {
         session= MybatisUtil2.getSession();
         Student student=session.selectOne("test1.findStudentByIdCard",idCard);
         return student;
    }

    @Override
    public Student findStudentByIdCard2(int idCard) {
        session= MybatisUtil2.getSession();
        Student student=session.selectOne("test1.findStudentByIdCard2",idCard);
        return student;
    }
}
