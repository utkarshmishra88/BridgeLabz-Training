package com.markerinterface.backupdataserialization;
public class BackupProcessor {

    public static void backup(Object obj) {

        if (obj instanceof Backupable) {
            System.out.println("Backing up: " + obj);
        } else {
            System.out.println("Backup not allowed for: " + obj);
        }
    }
}
