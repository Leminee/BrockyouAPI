package tech.goodquestion.brockyou.api;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface Repository extends JpaRepository<Password, String> {

    @Query(value = "SELECT pass FROM leaked_password WHERE pass=:password", nativeQuery = true)
    List<Password> findByPass(String password);

}
