package aspect_04;

import java.util.Date;

//监控信息记录类
public class MonitorTime {
    private  String className;
    private  String methodName;
    private Date logTime;
    private long comsumeTime;  //计算时间

    public MonitorTime(){
    }

    public MonitorTime(String className, String methodName, Date logTime, long comsumeTime) {
        this.className = className;
        this.methodName = methodName;
        this.logTime = logTime;
        this.comsumeTime = comsumeTime;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Date getLogTime() {
        return logTime;
    }

    public void setLogTime(Date logTime) {
        this.logTime = logTime;
    }

    public long getComsumeTime() {
        return comsumeTime;
    }

    public void setComsumeTime(long comsumeTime) {
        this.comsumeTime = comsumeTime;
    }
}
