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

    public void deletePassword(Password password) {

        repository.delete(password);
    }

    public Password addNewPassword(Password password) {

        return repository.save(password);
    }


    public PasswordData getPassInfo(String password) {

        boolean hasBeenLeaked = password.length() < 6 || rowExists(password);

        return new PasswordData(new Password(password).getPass(), hasBeenLeaked, password.length());
    }


    private boolean rowExists(String password) {

        return repository.existsById(password);
    }
    
}
