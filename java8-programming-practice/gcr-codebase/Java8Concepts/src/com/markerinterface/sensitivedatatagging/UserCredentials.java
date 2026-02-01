package com.markerinterface.sensitivedatatagging;
public class UserCredentials implements SensitiveData {

    private String username;
    private String password;

    public UserCredentials(String u, String p) {
        this.username = u;
        this.password = p;
    }

    @Override
    public String toString() {
        return "UserCredentials{username='" + username + "', password='" + password + "'}";
    }
}
