package com.texteditor;
import java.util.Scanner;

public class TextEditorApp {

    public static void main(String[] args) {

        TextEditor editor = new TextEditor();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nCurrent Text: " + editor.getContent());
            System.out.println("1.Insert  2.Delete  3.Undo  4.Redo  5.Exit");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter text: ");
                    editor.insert(sc.nextLine());
                    break;

                case 2:
                    System.out.print("Enter length to delete: ");
                    editor.delete(sc.nextInt());
                    break;

                case 3:
                    editor.undo();
                    break;

                case 4:
                    editor.redo();
                    break;
            }

        } while (choice != 5);

        sc.close();
    }
}
