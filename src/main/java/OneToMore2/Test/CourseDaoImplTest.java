package OneToMore2.Test;

import OneToMore2.Dao.CourseDao;
import OneToMore2.DaoImpl.CourseDaoImpl;
import OneToMore2.POJO.Course;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.ContextConfiguration;


import static org.junit.jupiter.api.Assertions.*;


class CourseDaoImplTest {

    CourseDao courseDao=new CourseDaoImpl();

    @Test
    void findCourseById() {
        Course course=courseDao.findCourseById(1);
        System.out.println(course);
    }
}