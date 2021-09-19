package de.brockyou.api;

import javax.inject.Inject;

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

        return repository.findByPass(password).size() > 0;

    }
}
