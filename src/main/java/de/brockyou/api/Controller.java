package de.brockyou.api;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class Controller {

    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping(path ="/{password}", produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean isPwned(@PathVariable String password) {
        return service.isPwned(password);
    }
}
