package de.brockyou.api;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@NamedQuery(name = "Password.findById", query = "SELECT p FROM leaked_password p WHERE p.pass=:password")
@Entity(name = "leaked_password")
public class Password {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
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
