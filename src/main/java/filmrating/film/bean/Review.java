package filmrating.film.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;

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
    int love;
    Date reviewdate;

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

    public void setLove(int love) {
        this.love = love;
    }

    public int getLove() {
        return love;
    }

    public void setDate(Date t) {
        this.reviewdate = t;
    }

    public Date getDate() {
        return reviewdate;
    }
}
