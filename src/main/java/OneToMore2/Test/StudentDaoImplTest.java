package OneToMore2.Test;

import OneToMore2.Dao.StudentDao;
import OneToMore2.DaoImpl.StudentDaoImpl;
import OneToMore2.POJO.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentDaoImplTest {

     StudentDao studentDao=new StudentDaoImpl();

    @Test
    void findStudentByIdCard() {
        Student student=studentDao.findStudentByIdCard(1702343305);
        System.out.println(student);
    }

    @Test
    void findStudentByIdCard2() {
        Student student=studentDao.findStudentByIdCard2(1702343305);
        System.out.println(student);
    }
}