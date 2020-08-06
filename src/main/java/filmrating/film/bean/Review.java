package filmrating.film.bean;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int rid;
    int fid;
    int uid;
    String content;
    int like;

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getUid() {
        return uid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public int getFid() {
        return fid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public int getRid() {
        return rid;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getLike() {
        return like;
    }
}
