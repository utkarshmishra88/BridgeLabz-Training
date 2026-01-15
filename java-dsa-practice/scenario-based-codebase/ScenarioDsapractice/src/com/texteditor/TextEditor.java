package com.texteditor;
import java.util.Stack;

class TextEditor {

    private String content = "";
    private Stack<Action> undoStack = new Stack<>();
    private Stack<Action> redoStack = new Stack<>();

    public void insert(String text) {
        content += text;
        undoStack.push(new Action("INSERT", text));
        redoStack.clear();
    }

    public void delete(int length) {
        if (length > content.length()) return;

        String deletedText = content.substring(content.length() - length);
        content = content.substring(0, content.length() - length);

        undoStack.push(new Action("DELETE", deletedText));
        redoStack.clear();
    }

    public void undo() {
        if (undoStack.isEmpty()) {
            System.out.println("Nothing to undo");
            return;
        }

        Action action = undoStack.pop();

        if (action.type.equals("INSERT")) {
            content = content.substring(0, content.length() - action.text.length());
        } else { // DELETE
            content += action.text;
        }

        redoStack.push(action);
    }

    public void redo() {
        if (redoStack.isEmpty()) {
            System.out.println("Nothing to redo");
            return;
        }

        Action action = redoStack.pop();

        if (action.type.equals("INSERT")) {
            content += action.text;
        } else { // DELETE
            content =content.substring(0, content.length() - action.text.length());
        }

        undoStack.push(action);
    }

    public String getContent() {
        return content;
    }
}
