package com.markerinterface.backupdataserialization;
public class UserData implements Backupable {

    private String username;

    public UserData(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "UserData: " + username;
    }
}
