package com.example.designpattern.CommandPattern;


class TextEditor {
    public void boldText() {
        System.out.println("Text has been bolded");
    }

    public void italicText() {
        System.out.println("Text has been italic");
    }

    public void underlineText() {
        System.out.println("Text has been underline");
    }

}

// UI button classes
class BoldButton {
    private TextEditor textEditor;

    public BoldButton(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    public void click() {
        textEditor.boldText();
    }
}

class ItalicButton {
    private TextEditor textEditor;

    public ItalicButton(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    public void click() {
        textEditor.italicText();
    }
}


public class WithoutCommandPattern {


    public static void main(String[] args) {
        System.out.println("-------- Without Command Pattern --------");

        TextEditor textEditor = new TextEditor();

        // tightly coupled
        BoldButton boldButton = new BoldButton(textEditor);
        boldButton.click();

        // tightly coupled
        ItalicButton italicButton = new ItalicButton(textEditor);
        italicButton.click();

        /**
         * ----------- Problems -----------
         * Each button class is tightly coupled with the TextEditor. If the action changes,
         * all button classes need to be modified
         *
         * It's harder to extend with new commands or add functionality such as undo/redo
         * or logging.
         */

    }
}
