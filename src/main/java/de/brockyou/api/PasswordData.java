package de.brockyou.api;

public class PasswordData {

    private String givenPassword;
    private Boolean hasBeenLeaked;
    private Integer passwordLength;

    public PasswordData(String givenPassword, Boolean hasBeenLeaked, Integer passwordLength) {
        this.givenPassword = givenPassword;
        this.hasBeenLeaked = hasBeenLeaked;
        this.passwordLength = passwordLength;
    }

    public String getGivenPassword() {
        return givenPassword;
    }

    public Boolean getHasBeenLeaked() {
        return hasBeenLeaked;
    }

    public Integer getPasswordLength() {
        return passwordLength;
    }
}
