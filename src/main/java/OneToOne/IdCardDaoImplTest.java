package OneToOne;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class IdCardDaoImplTest {

    IdCardDao idCardDao=new IdCardDaoImpl();

    @Test
    void insertIdCard() {
        IdCard idCard=new IdCard();
        idCard.setCode("34444444444");
        int n=idCardDao.insertIdCard(idCard);
        int a=idCard.getC_id();
        System.out.println("新增数据的主键:" + a);
    }

    @Test
    void findIdCardByCid() {
    }

    @Test
    void delIdCardByCid() {
    }

    @Test
    void updateIdCard() {
    }

    @Test
    void getAllIdCard() {
    }
}