package OneToMore.POJO;

public class Orders {

    private int id;
    private int number;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber( int  number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", number=" + number +
                '}';
    }
}
