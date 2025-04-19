package com.example.designpattern.CommandPattern;

/**
 * By introducing the Command Pattern, we can decouple the actions
 * (bold, italic, underline) from the UI components (buttons), making
 * the design more flexible and maintainable. The buttons no longer
 * need to know about the editor directly but instead work with generic
 * Command objects.
 */

// Command interface
interface Command {
    void execute();
}

class BoldCommand implements Command {
    private TextEditorII textEditor;

    public BoldCommand(TextEditorII textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        textEditor.boldText();
    }
}

class ChangeColorCommand implements Command {
    private TextEditorII textEditor;
    public ChangeColorCommand(TextEditorII textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        textEditor.changeColor();
    }
}

// Button Class
class Button {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void click () {
        command.execute();
    }
}

// Receiver: TextEditor Class
class TextEditorII {
    public void boldText() {
        System.out.println("Text has been bolded");
    }
    public void changeColor() {
        System.out.println("Text color has been changed");
    }
}


public class WithCommandPattern {

    public static void main(String[] args) {
        TextEditorII textEditor = new TextEditorII();

        Button button = new Button();
        button.setCommand(new BoldCommand(textEditor));
        button.click();

        button.setCommand(new ChangeColorCommand(textEditor));
        button.click();
    }
}
