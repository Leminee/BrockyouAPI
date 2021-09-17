package de.brockyou.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;


@RestController
@CrossOrigin
@RequestMapping("brockyou/api/v1")
public class Controller {

    @Autowired
    private final Service service;

    @Autowired
    @Inject
    private final Repository repository;

    @Inject
    public Controller(Service service, Repository repository) {
        this.service = service;
        this.repository = repository;
    }

    @GetMapping(path = "/{password}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getPassData(@PathVariable("password") String password) {

        try {
            return ResponseEntity.ok(service.getPassInfo(password));

        } catch (Exception e) {
            return ResponseEntity.ok("");
        }
    }




    @GetMapping(path = "/amount", produces = MediaType.APPLICATION_JSON_VALUE)
    public Long getAmountPasswords() {

        return service.getRowCount();
    }

    @PostMapping(path = "/add/{password}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String addNewPassword(@PathVariable("password") String password) {

        Password current = new Password(password);

       Password res = repository.saveAndFlush(current);

       return res.getPass();

    }


    @DeleteMapping(path = "/delete/{password}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void deletePassword(@PathVariable("password") Password password) {

        service.deletePassword(password);
    }
}
