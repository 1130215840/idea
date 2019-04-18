package aspect_04;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class MonitorUtils {
    private static Logger logger= LogManager.getLogger(TimeAspect.class);

    public static void report(MonitorTime monitorTime){
        logger.info("API接口性能分析：" + monitorTime.getMethodName() +
                "方法调用花费了"  + monitorTime.getComsumeTime() + "毫秒 " + monitorTime.getLogTime());
    }
}
