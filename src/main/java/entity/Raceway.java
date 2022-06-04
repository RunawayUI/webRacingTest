package entity;

import javax.persistence.*;

@Entity
@Table(name = "raceway")
public class Raceway {
    @Id
    @Column(name = "id", nullable = false)
    private java.lang.Integer id;

    @Column(name = "name", nullable = false, length = 100)
    private java.lang.String name;

    @Column(name = "link_pic")
    private java.lang.String linkPic;

    @Lob
    @Column(name = "about")
    private java.lang.String about;

    public java.lang.Integer getId() {
        return id;
    }

    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public java.lang.String getLinkPic() {
        return linkPic;
    }

    public void setLinkPic(java.lang.String linkPic) {
        this.linkPic = linkPic;
    }

    public java.lang.String getAbout() {
        return about;
    }

    public void setAbout(java.lang.String about) {
        this.about = about;
    }

}