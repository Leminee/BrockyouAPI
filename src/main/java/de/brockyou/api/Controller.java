package de.brockyou.api;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("betterrockyou/api/v1")
public class Controller {


    private Repository repository;

    public Controller(Repository repository) {
        this.repository = repository;
    }

   @GetMapping(path = "/{password}",produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean isPwned(@PathVariable String password) {
       return repository.findById(password).isPresent();
    }
}
