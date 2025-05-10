package com.example.designpattern.AbstractFactoryPattern.With;

interface Button {
    void render();
}

interface ScrollBar {
    void scroll();
}

class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Windows Button");
    }
}

class WindowsScrollBar implements ScrollBar {
    @Override
    public void scroll() {
        System.out.println("Scrolling Windows scrollBar");
    }
}

class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Mac Button");
    }
}

class MacScrollBar implements ScrollBar {
    @Override
    public void scroll() {
        System.out.println("Scrolling Mac scrollBar");
    }
}

// Abstract Factory Interface
interface UIFactory {
    Button createButton();
    ScrollBar createScrollBar();
}

// Concrete Implementation
class WindowsFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public ScrollBar createScrollBar() {
        return new WindowsScrollBar();
    }
}

class MacFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public ScrollBar createScrollBar() {
        return new MacScrollBar();
    }
}


public class Application {
    private final Button button;
    private final ScrollBar scrollBar;

    public Application(UIFactory uiFactory) {
        this.button = uiFactory.createButton();
        this.scrollBar = uiFactory.createScrollBar();
    }

    public void renderUI() {
        button.render();
        scrollBar.scroll();
    }

}
