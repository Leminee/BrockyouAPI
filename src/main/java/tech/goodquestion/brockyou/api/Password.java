package tech.goodquestion.brockyou.api;

import javax.persistence.*;


@Entity()
@Table(name ="leaked_password")
public class Password {


    @GeneratedValue
    @Id
    @Column(name = "id_pass", nullable = false)
    private long id;

    @Column(name ="pass", nullable = false)
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
