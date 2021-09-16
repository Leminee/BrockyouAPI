package de.brockyou.api;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Table()
@Entity(name = "leaked_password")
public class Password {

    @Id
    public String pass;

    public boolean hasBeenLeaked;
    public int passLength;

    public Password(String pass, boolean isPwned) {
        this.pass = pass;
        this.hasBeenLeaked = hasBeenLeaked;
        this.passLength = pass.length();

    }

    public Password() {

    }

    public String getPass() {
        return pass;
    }
    public int getPassLength() {
        return pass.length();
    }
}
