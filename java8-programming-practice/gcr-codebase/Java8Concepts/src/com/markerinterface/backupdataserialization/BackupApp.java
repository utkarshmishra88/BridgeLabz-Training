package com.markerinterface.backupdataserialization;
public class BackupApp {

    public static void main(String[] args) {

        Object user = new UserData("Utkarsh");
        Object invoice = new Invoice(101);
        Object cache = new TempCache();

        BackupProcessor.backup(user);
        BackupProcessor.backup(invoice);
        BackupProcessor.backup(cache);
    }
}
