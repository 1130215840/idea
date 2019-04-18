package mybatis_spring.PO;

public class Forum {
    private int forum_id;
    private String forum_name;

    public int getForum_id() {
        return forum_id;
    }

    public void setForum_id(int forum_id) {
        this.forum_id = forum_id;
    }

    public String getForum_name() {
        return forum_name;
    }

    public void setForum_name(String forum_name) {
        this.forum_name = forum_name;
    }

    @Override
    public String toString() {
        return "Forum{" +
                "forum_id=" + forum_id +
                ", forum_name='" + forum_name + '\'' +
                '}';
    }
}
