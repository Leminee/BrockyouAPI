package de.brockyou.api;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;


@RestController
@CrossOrigin
@RequestMapping("brockyou/api/v1")
public class Controller {

    private final Service service;

    @Inject
    public Controller(Service service) {
        this.service = service;

    }

    @GetMapping(path = "/{password}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getPassData(@PathVariable("password") String password) {

        return ResponseEntity.ok(service.getPassInfo(password));
    }


    @GetMapping(path = "/amount", produces = MediaType.APPLICATION_JSON_VALUE)
    public Long getAmountPasswords() {

        return service.getRowCount();
    }
}
