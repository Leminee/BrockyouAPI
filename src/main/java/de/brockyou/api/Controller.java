package de.brockyou.api;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;


@RestController
@RequestMapping("brockyou/api/v1")
public class Controller {

    private final Repository repository;

    @Inject
    public Controller(Repository repository) {
        this.repository = repository;
    }

    @GetMapping(path = "/{password}", produces = MediaType.APPLICATION_JSON_VALUE)
    public PasswordData getPassData(@PathVariable String password) {

        boolean hasBeenLeaked = password.length() < 6 || repository.existsById(password);

        return new PasswordData(new Password(password).getPass(), hasBeenLeaked, password.length());
    }
}
