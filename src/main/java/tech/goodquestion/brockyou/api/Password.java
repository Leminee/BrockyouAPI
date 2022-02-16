package tech.goodquestion.brockyou.api;

import javax.persistence.*;


@Entity()
@Table(name ="leaked_password")
public class Password {

    @GeneratedValue
    @Id
    @Column(name = "id_pass")
    private Long idPass;

    @Column(name ="pass", nullable = false)
    private String pass;

    public Password() {

    }

    public Password(String pass) {
        this.pass = pass;
    }


    public String getPass() {
        return pass;
    }

    public Long getIdPass(){
        return idPass;
    }

}
