package filmrating.film.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name="review")
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})
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
