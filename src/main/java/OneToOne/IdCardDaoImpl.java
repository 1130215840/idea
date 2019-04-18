package OneToOne;

import org.apache.ibatis.session.SqlSession;

import java.util.List;


public class IdCardDaoImpl implements IdCardDao {

    SqlSession session;

    @Override
    public int insertIdCard(IdCard idCard) {
        session=MybatisUtil.getSession();
        int n=session.insert("insertIdCard",idCard);
        session.commit();
        session.close();
        return n;
    }

    @Override
    public IdCard findIdCardByCid(int c_id) {
        return null;
    }

    @Override
    public int delIdCardByCid(int c_id) {
        return 0;
    }

    @Override
    public int updateIdCard(IdCard idCard) {
        return 0;
    }

    @Override
    public List<IdCard> getAllIdCard() {
        return null;
    }
}
