package de.brockyou.api;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Table()
@Entity(name = "leaked_password")
public class Password {

    @Id
    @Column(name = "pass", nullable = false)
    private String pass;

    public Password(String pass) {
        this.pass = pass;
    }

    public Password() {

    }

    public String getPass() {
        return pass;
    }
}
