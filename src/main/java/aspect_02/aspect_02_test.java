package aspect_02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class aspect_02_test {
    public static void main(String[] args) {
        String xmlPath= "aspect_02/aspect_02_beans.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(xmlPath);
        Hello hello= (Hello) ac.getBean("hello");
        hello.SayHello();
    }
}
