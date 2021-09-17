package de.brockyou.api;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;

@RestController
@RequestMapping("brockyou/api/v1")
public class Controller {

    private final Service service;

    @Inject
    public Controller( Service service) {
        this.service = service;
    }

    @GetMapping(path = "/{password}", produces = MediaType.APPLICATION_JSON_VALUE)
    public PasswordData getPassData(@PathVariable("password") String password) {


        return service.getPassInfo(password);
    }


    @GetMapping(path = "/amount", produces = MediaType.APPLICATION_JSON_VALUE)
    public Long getAmountPasswords() {

        return service.getRowCount();
    }


    @PostMapping(path = "/add/{password}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Password addNewPassword(@PathVariable("password") Password password) {

        return service.addNewPassword(password);
    }


    @DeleteMapping(path = "/delete/{password}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void deletePassword(@PathVariable("password") Password password) {

        service.deletePassword(password);
    }
}
