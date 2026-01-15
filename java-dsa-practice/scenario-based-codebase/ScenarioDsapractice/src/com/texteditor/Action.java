package com.texteditor;

class Action {
    String type;   // INSERT or DELETE
    String text;

    Action(String type, String text) {
        this.type = type;
        this.text = text;
    }
}
