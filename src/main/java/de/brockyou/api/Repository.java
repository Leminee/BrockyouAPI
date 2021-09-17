package de.brockyou.api;

import com.cosium.spring.data.jpa.entity.graph.repository.EntityGraphJpaSpecificationExecutor;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.List;

public interface Repository extends JpaRepository<Password, String>, EntityGraphJpaSpecificationExecutor<Password> {

    @Transactional
    List <Password> findByPass(String password);



}
