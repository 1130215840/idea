package OneToMore2.DaoImpl;

import OneToMore2.Dao.CourseDao;
import OneToMore2.POJO.Course;
import OneToMore2.Utils.MybatisUtil2;
import org.apache.ibatis.session.SqlSession;


public class CourseDaoImpl implements CourseDao {

    SqlSession session;

    @Override
    public Course findCourseById(int id) {
        session= MybatisUtil2.getSession();
        Course course=session.selectOne("test.findCourseById",id);
        session.close();
        return course;
    }
}
