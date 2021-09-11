package de.brockyou.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("brockyou/api/v1")
public class Controller {

    @Autowired
    private Repository repository;


    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Password> getAllPasswords() {
        return repository.findAll();
    }
}
