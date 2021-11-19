package tech.goodquestion.brockyou.api;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity()
@Table(name ="leaked_password")
public class Password {


    @GeneratedValue
    @Id
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
