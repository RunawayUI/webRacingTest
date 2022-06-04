package entity;

import javax.persistence.*;

@Entity
@Table(name = "timetable")
public class Timetable {
    @Id
    @Column(name = "id", nullable = false)
    private java.lang.Integer id;

    @Column(name = "name", nullable = false, length = 100)
    private java.lang.String name;

    @Column(name = "date", nullable = false)
    private java.time.Instant date;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_raceway", nullable = false)
    private Raceway idRaceway;

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

    public java.time.Instant getDate() {
        return date;
    }

    public void setDate(java.time.Instant date) {
        this.date = date;
    }

    public Raceway getIdRaceway() {
        return idRaceway;
    }

    public void setIdRaceway(Raceway idRaceway) {
        this.idRaceway = idRaceway;
    }

}