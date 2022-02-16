package tech.goodquestion.brockyou.api;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface Repository extends JpaRepository<Password, Long> {


    @Query(value = "SELECT id_pass, pass FROM leaked_password WHERE pass=:password", nativeQuery = true)
    List<Password> findByPass(@Param("password") final String password);

}
