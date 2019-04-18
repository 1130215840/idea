package OneToOne;

import java.util.List;
import java.util.Map;

public interface PersonDao {

    int insertPerson(Person person);

    int delPersonByPid(int p_id);

    Person findPersonByPid3(int p_id);

    List<Person> selectAllPerson();

    int updatePerson(Person person);

    Map getPersonInfo(int p_id);







}
