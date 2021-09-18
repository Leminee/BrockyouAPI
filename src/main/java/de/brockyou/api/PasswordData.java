package de.brockyou.api;

public record PasswordData (String givenPassword, boolean hasBeenLeaked, int passwordLength){}
