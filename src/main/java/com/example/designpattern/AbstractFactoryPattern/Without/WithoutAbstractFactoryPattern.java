package com.example.designpattern.AbstractFactoryPattern.Without;



class WindowsButton {
    public void render() {
        System.out.println("Rendering Windows Button");
    }
}

class WindowsScrollBar {
    public void render() {
        System.out.println("Rendering Windows ScrollBar");
    }
}

class MacButton {
    public void render() {
        System.out.println("Rendering Mac Button");
    }
}

class MacScrollBar {
    public void render() {
        System.out.println("Rendering Mac ScrollBar");
    }
}
/**
 * <h2>🔧 Key Issues Without Abstract Factory Pattern</h2>
 * <h3>🛑 Problem with Dynamically Choosing UI Components Without Abstract Factory</h3>
 *
 * <ol>
 *   <li>
 *     <strong>Hardcoding OS-Specific Logic</strong><br>
 *     If you want to switch to Mac UI, you'd rewrite this part:<br><br>
 *     <pre><code>
 * MacButton macButton = new MacButton();
 * MacScrollBar macScrollBar = new MacScrollBar();
 *
 * macButton.render();
 * macScrollBar.render();
 *     </code></pre>
 *   </li>
 *
 *   <li>
 *     <strong>Trying to Handle Dynamism with If-Else</strong><br>
 *     What if you want to choose dynamically based on user input?<br><br>
 *     <pre><code>
 * String os = "mac"; // could be "windows" or "mac"
 * if (os.equals("mac")) {
 *     MacButton macButton = new MacButton();
 *     MacScrollBar macScrollBar = new MacScrollBar();
 *     macButton.render();
 *     macScrollBar.render();
 * } else {
 *     WindowsButton windowsButton = new WindowsButton();
 *     WindowsScrollBar windowsScrollBar = new WindowsScrollBar();
 *     windowsButton.render();
 *     windowsScrollBar.render();
 * }
 *     </code></pre>
 *   </li>
 *
 *   <li>
 *     <strong>Code Duplication</strong><br>
 *     You're repeating a lot of code for each UI platform.
 *   </li>
 *
 *   <li>
 *     <strong>Encapsulation Violation</strong><br>
 *     Your <code>main()</code> method knows too much about the details of <code>Button</code> and <code>ScrollBar</code> classes —
 *     this violates encapsulation and makes the code harder to maintain.
 *   </li>
 *   <li>
 *     <strong>Tight Coupling to Concrete Classes</strong><br>
 *     The code directly uses <code>WindowsButton</code> and <code>WindowsScrollBar</code>:<br><br>
 *     <pre><code>
 * WindowsButton windowsButton = new WindowsButton();
 * WindowsScrollBar windowsScrollBar = new WindowsScrollBar();
 *     </code></pre>
 *     This means the client (main method) is tightly bound to specific implementations,
 *     making it hard to switch to other UI toolkits like Mac or Linux.
 *   </li>
 *
 *   <li>
 *     <strong>No Interface or Abstraction</strong><br>
 *     There's no common interface like <code>Button</code> or <code>ScrollBar</code>,
 *     so we can't write code that works with different families of products
 *     (Windows, Mac) interchangeably.
 *   </li>
 *
 *   <li>
 *     <strong>Poor Scalability</strong><br>
 *     If you want to support another OS (like <code>LinuxButton</code>, <code>LinuxScrollBar</code>),
 *     you'll have to manually change or duplicate logic in the main program to render Linux UI,
 *     which leads to code duplication and violation of the Open-Closed Principle
 *     (should be open for extension, closed for modification).
 *   </li>
 *
 *   <li>
 *     <strong>Hard to Maintain or Extend</strong><br>
 *     Every time you want to support a new family of UI components,
 *     you'll have to change the logic in the main method or elsewhere in the app,
 *     rather than simply plugging in a new factory.
 *   </li>
 * </ol>
 */
public class WithoutAbstractFactoryPattern {
    public static void main(String[] args) {
        System.out.println("------- Without Abstract Factory Pattern -------");
        WindowsButton windowsButton = new WindowsButton();
        WindowsScrollBar windowsScrollBar = new WindowsScrollBar();

        windowsButton.render();
        windowsScrollBar.render();

    }
}
