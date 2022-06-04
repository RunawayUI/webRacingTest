package entity;

import javax.persistence.*;

@Entity
@Table(name = "account_registr")
public class AccountRegistr {
    @Id
    @Column(name = "id", nullable = false)
    private java.lang.Integer id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id", nullable = false)
    private Account account;

    @Column(name = "code", nullable = false)
    private java.lang.String code;

    public java.lang.Integer getId() {
        return id;
    }

    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public java.lang.String getCode() {
        return code;
    }

    public void setCode(java.lang.String code) {
        this.code = code;
    }

}