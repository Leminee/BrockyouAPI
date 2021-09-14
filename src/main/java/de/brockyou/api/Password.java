package de.brockyou.api;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Table()
@Entity(name="leaked_password")
public class Password {

    @Id
    public String pass;

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getPassLength() {
        return pass.length();
    }
}
