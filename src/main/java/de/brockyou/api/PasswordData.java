package de.brockyou.api;

public record PasswordData (String givenPassword, Boolean hasBeenLeaked, Integer passwordLength){

}
