package OneToMore2.Dao;

import OneToMore2.POJO.Student;

public interface StudentDao {

    Student findStudentByIdCard(int idCard);

    Student findStudentByIdCard2(int idCard);
}
