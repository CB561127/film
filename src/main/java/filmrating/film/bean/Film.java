package filmrating.film.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="film")
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int fid;
    String name;
    double score;
    String description;
    String country;
    String  poster;
    String type;
    Date time;
    int number;
    String director;
    String cast;
    String westtag;

    public void setFid(int fid) {
        this.fid = fid;
    }

    public int getFid() {
        return fid;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Date getTime() {
        return time;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getPoster() {
        return poster;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public String getCast() {
        return cast;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setWesttag(String tag){
        this.westtag = tag;
    }

    public String getWesttag() {
        return westtag;
    }
    @Override
    public String toString() {
            return "电影名字："+name+"\'"+
                    "分数："+score+"\'"+
                    "地区："+country+"\'";
    }
}
