package OneToMore2.Utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class MybatisUtil2 {

    private static SqlSessionFactory sqlSessionFactory;

    static {
        try {
            //  使用 MyBatis 提供的Resources类加载MyBatis 的配置文件
            Reader reader = Resources.getResourceAsReader("OneToOneAndOneToMore/mybatis-config2.xml");
            //  构建 SqlSessionFactory
            sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //  获取SqlSession 对象的静态方法
    public static SqlSession getSession(){
        return sqlSessionFactory.openSession();
    }
}
