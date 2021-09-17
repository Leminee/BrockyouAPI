package de.brockyou.api;

import org.springframework.beans.factory.annotation.Autowired;

import javax.inject.Inject;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    private final Repository repository;

    @Inject
    public Service(Repository repository) {
        this.repository = repository;
    }

    public long getRowCount() {
        return repository.count();
    }


    public PasswordData getPassInfo(String password) {

        boolean hasBeenLeaked = password.length() < 6 || rowExists(password);

        return new PasswordData(new Password(password).getPass(), hasBeenLeaked, password.length());
    }


    private boolean rowExists(String password) {

        List<Password> passList = repository.findByPass(password);

        return passList.size() > 0;
    }
}
