package AspectJ_beforeAdvice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        // 1. 创建 Ioc 容器
         ApplicationContext ac=new ClassPathXmlApplicationContext("AspectJ_beforeAdvice/AspectJ_beforeAdvice_beans.xml");

         // 2. 从 Ioc 容器获取 bean 实例
          JiSuanQi jiSuanQi=ac.getBean(JiSuanQi.class);

          // 3. 使用 bean
          int result = jiSuanQi.add(2,3);
          System.out.println("result:"+result);

          int result1 = jiSuanQi.div(12,3);
        System.out.println("result1: "+result1);
      //  LoggingAspect loggingAspect=(LoggingAspect)ac.getBean("loggingAspect");

        //JiSuanQi jiSuanQi=new JiSuanQiImpl();
        //System.out.println(jiSuanQi.add(3,4));
    }
}
