package OneToOne;

public class IdCard {

    private int c_id;
    private String code;

    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "IdCard{" +
                "c_id=" + c_id +
                ", code='" + code + '\'' +
                '}';
    }
}
