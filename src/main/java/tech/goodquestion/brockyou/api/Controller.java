package tech.goodquestion.brockyou.api;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import javax.validation.constraints.NotNull;

@RestController
@CrossOrigin
@RequestMapping("brockyou/api/v2")
public class Controller {

    private final Service service;

    @Inject
    public Controller(Service service) {
        this.service = service;

    }

    @GetMapping(path = "/{password}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PasswordData> getPassData(@PathVariable("password") @NotNull String password) {

        return ResponseEntity.ok(service.getPassInfo(password));

    }

    @GetMapping(path = "/amount/passwords", produces = MediaType.APPLICATION_JSON_VALUE)
    public long getAmountPasswords() {

        return service.getRowCount();
    }
}
