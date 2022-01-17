package tech.goodquestion.brockyou.api;

import javax.inject.Inject;

@org.springframework.stereotype.Service
public class Service {

    private final Repository repository;

    @Inject
    public Service(final Repository repository) {
        this.repository = repository;
    }

    public PasswordData getPassInfo(final String password) {

        final boolean hasBeenLeaked = password.length() < 8 || rowExists(password);

        return new PasswordData(new Password(password).getPass(), hasBeenLeaked, password.length());
    }


    private boolean rowExists(final String password) {

        return repository.findByPass(password).size() > 0;

    }
}
