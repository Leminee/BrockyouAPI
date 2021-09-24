package de.brockyou.api;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@NamedQuery(name = "Password.findById", query = "SELECT pass FROM leaked_password WHERE pass=:password")
@Entity(name = "leaked_password")
public class Password {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_pass")
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
