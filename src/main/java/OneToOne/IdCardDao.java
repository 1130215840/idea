package OneToOne;

import java.util.List;

public interface IdCardDao {

    int insertIdCard(IdCard idCard);

    IdCard findIdCardByCid(int c_id);

    int delIdCardByCid(int c_id);

    int updateIdCard(IdCard idCard);

    List<IdCard> getAllIdCard();



}
