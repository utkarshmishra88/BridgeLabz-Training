package com.lambdaexpression.notificationfiltering;

class Alert {
    String type;      // CRITICAL, WARNING, INFO
    String message;

    Alert(String type, String message) {
        this.type = type;
        this.message = message;
    }

    @Override
    public String toString() {
        return "[" + type + "] " + message;
    }
}