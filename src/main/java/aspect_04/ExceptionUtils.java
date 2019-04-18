package aspect_04;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class ExceptionUtils {
    private static Logger logger= LogManager.getLogger(ExceptionAspect.class);

    public  static void report(ExceptionInfo exceptionInfo){
        logger.info("异常监控：" + exceptionInfo.getClassName() + "类的" +
                exceptionInfo.getMethodName() + "方法调用时发生了异常："+exceptionInfo.getMessage());
    }
}
