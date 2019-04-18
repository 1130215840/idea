package mybatis_spring.PO;

import java.util.Arrays;

/*
   帖子实体类
 */
public class Post {

    private int post_id;
    private int forum_id;
    private String title;
    private  String content;
    private byte[] thumbnail;  //帖子缩略图

    public Post(int post_id, int forum_id, String title, String content, byte[] thumbnail) {
        this.post_id = post_id;
        this.forum_id = forum_id;
        this.title = title;
        this.content = content;
        this.thumbnail = thumbnail;
    }

    public Post() {
    }

    public int getPost_id() {
        return post_id;
    }

    public void setPost_id(int post_id) {
        this.post_id = post_id;
    }

    public int getForum_id() {
        return forum_id;
    }

    public void setForum_id(int forum_id) {
        this.forum_id = forum_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public byte[] getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(byte[] thumbnail) {
        this.thumbnail = thumbnail;
    }

    @Override
    public String toString() {
        return "Post{" +
                "post_id=" + post_id +
                ", forum_id=" + forum_id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", thumbnail=" + Arrays.toString(thumbnail) +
                '}';
    }
}
