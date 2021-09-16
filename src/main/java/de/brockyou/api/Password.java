package de.brockyou.api;


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
    public int getPassLength() {
        return pass.length();
    }
}
