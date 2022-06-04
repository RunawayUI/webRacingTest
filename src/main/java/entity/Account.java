package entity;

import javax.persistence.*;

@Entity
@Table(name = "account")
public class Account {
    @Id
    @ManyToOne(optional = false)
    @JoinColumn(name = "id_ID", nullable = false)
    private java.lang.String id;

    @Column(name = "login", nullable = false, length = 50)
    private java.lang.String login;

    @Column(name = "password", nullable = false)
    private java.lang.String password;

    @Column(name = "first_name", nullable = false, length = 100)
    private java.lang.String firstName;

    @Column(name = "last_name", nullable = false, length = 100)
    private java.lang.String lastName;

    @Column(name = "email", nullable = false, length = 100)
    private java.lang.String email;

    @Column(name = "country", length = 100)
    private java.lang.String country;

    @Column(name = "active")
    private java.lang.Integer active;

    @Column(name = "created")
    private java.time.Instant created;

    @Column(name = "link_pic_small", length = 250)
    private java.lang.String linkPicSmall;

    @Column(name = "link_pic", length = 250)
    private java.lang.String linkPic;

    @Column(name = "helmet_pic", length = 250)
    private java.lang.String helmetPic;

    @Column(name = "nimb_lic")
    private java.lang.Integer nimbLic;

    @Column(name = "team", length = 70)
    private java.lang.String team;

    @Column(name = "points")
    private java.lang.Integer points;

    @Lob
    @Column(name = "about")
    private java.lang.String about;

    @Column(name = "tel", length = 70)
    private java.lang.String tel;

    @Column(name = "vk", length = 100)
    private java.lang.String vk;

    @Column(name = "facebook", length = 100)
    private java.lang.String facebook;

    @Column(name = "inst", length = 100)
    private java.lang.String inst;

    public java.lang.String getId() {
        return id;
    }

    public void setId(java.lang.String id) {
        this.id = id;
    }

    public java.lang.String getLogin() {
        return login;
    }

    public void setLogin(java.lang.String login) {
        this.login = login;
    }

    public java.lang.String getPassword() {
        return password;
    }

    public void setPassword(java.lang.String password) {
        this.password = password;
    }

    public java.lang.String getFirstName() {
        return firstName;
    }

    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }

    public java.lang.String getLastName() {
        return lastName;
    }

    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }

    public java.lang.String getEmail() {
        return email;
    }

    public void setEmail(java.lang.String email) {
        this.email = email;
    }

    public java.lang.String getCountry() {
        return country;
    }

    public void setCountry(java.lang.String country) {
        this.country = country;
    }

    public java.lang.Integer getActive() {
        return active;
    }

    public void setActive(java.lang.Integer active) {
        this.active = active;
    }

    public java.time.Instant getCreated() {
        return created;
    }

    public void setCreated(java.time.Instant created) {
        this.created = created;
    }

    public java.lang.String getLinkPicSmall() {
        return linkPicSmall;
    }

    public void setLinkPicSmall(java.lang.String linkPicSmall) {
        this.linkPicSmall = linkPicSmall;
    }

    public java.lang.String getLinkPic() {
        return linkPic;
    }

    public void setLinkPic(java.lang.String linkPic) {
        this.linkPic = linkPic;
    }

    public java.lang.String getHelmetPic() {
        return helmetPic;
    }

    public void setHelmetPic(java.lang.String helmetPic) {
        this.helmetPic = helmetPic;
    }

    public java.lang.Integer getNimbLic() {
        return nimbLic;
    }

    public void setNimbLic(java.lang.Integer nimbLic) {
        this.nimbLic = nimbLic;
    }

    public java.lang.String getTeam() {
        return team;
    }

    public void setTeam(java.lang.String team) {
        this.team = team;
    }

    public java.lang.Integer getPoints() {
        return points;
    }

    public void setPoints(java.lang.Integer points) {
        this.points = points;
    }

    public java.lang.String getAbout() {
        return about;
    }

    public void setAbout(java.lang.String about) {
        this.about = about;
    }

    public java.lang.String getTel() {
        return tel;
    }

    public void setTel(java.lang.String tel) {
        this.tel = tel;
    }

    public java.lang.String getVk() {
        return vk;
    }

    public void setVk(java.lang.String vk) {
        this.vk = vk;
    }

    public java.lang.String getFacebook() {
        return facebook;
    }

    public void setFacebook(java.lang.String facebook) {
        this.facebook = facebook;
    }

    public java.lang.String getInst() {
        return inst;
    }

    public void setInst(java.lang.String inst) {
        this.inst = inst;
    }

}