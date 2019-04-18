package duoduiduo.Test;

import OneToMore2.Utils.MybatisUtil2;
import duoduiduo.PO.Orders;
import org.apache.ibatis.session.SqlSession;

public class Test {
    public static void main(String[] args) {
        SqlSession session = MybatisUtil2.getSession();
        Orders orders=session.selectOne("test.findOrdersWithProduct",1);
        System.out.println(orders);
        session.close();
    }
}
