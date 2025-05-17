package com.example.designpattern.CompositePattern.With;




/**
 * Demonstrates the Composite Design Pattern by simulating a hierarchical file system.
 *
 * <p>
 * The Composite Pattern allows treating individual objects (files) and compositions of objects (folders)
 * uniformly. This is especially useful for tree-like structures where each node can recursively contain
 * similar types of objects.
 * </p>
 *
 * <h2>1. Pattern Overview</h2>
 * <p>
 * In this implementation:
 * <ul>
 *     <li>{@code FileSystemComponent} is the common interface.</li>
 *     <li>{@code File} is a Leaf node, representing a terminal object in the hierarchy.</li>
 *     <li>{@code Folder} is a Composite node, capable of holding both files and other folders.</li>
 * </ul>
 * </p>
 *
 * <h2>2. Client Code Benefit</h2>
 * <p>
 * The client can operate on both simple (File) and complex (Folder) elements through the common
 * {@code FileSystemComponent} interface. For example:
 * </p>
 * <pre>{@code
 * FileSystemComponent document = new Folder("Documents");
 * document.addFileOrFolder(new File("Resume.pdf"));
 * document.showDetails(); // Uniform method call across file and folder
 * }</pre>
 *
 * <h2>3. Design Advantages</h2>
 * <ol>
 *   <li><strong>Extensibility:</strong> New types of files or folders can be added with minimal changes to existing code (Open/Closed Principle).</li>
 *   <li><strong>Reusability:</strong> Recursive structure allows reusing logic across the tree.</li>
 *   <li><strong>Maintainability:</strong> Common operations like {@code showDetails()} are centralized in the interface, reducing duplication.</li>
 * </ol>
 *
 * <h2>4. Real-World Use Cases</h2>
 * <ol>
 *   <li><strong>File Systems:</strong> Most operating systems (e.g., Windows, Linux, macOS) use this structure to organize files and directories.</li>
 *   <li><strong>UI Component Trees:</strong> JavaFX, Swing, React, and Flutter all implement nested views using this pattern.</li>
 *   <li><strong>Menu Hierarchies:</strong> Desktop apps (e.g., VS Code, IntelliJ) and websites use nested menus and submenus modeled via composite structures.</li>
 *   <li><strong>Document Editors:</strong> Word processors like MS Word or Google Docs treat paragraphs, tables, images as part of a composite document structure.</li>
 *   <li><strong>Game Engines:</strong> Engines like Unity and Unreal Engine organize scene objects hierarchically using composite patterns (scene graph).</li>
 * </ol>
 *
 * @see com.example.designpattern.CompositePattern.With.FileSystemComponent
 * @see com.example.designpattern.CompositePattern.With.File
 * @see com.example.designpattern.CompositePattern.With.Folder
 */
public class WithCompositePattern {
    public static void main(String[] args) {
        System.out.println("------- With Composite Pattern -------");

        Folder document = new Folder("Documents");

        Folder movie = new Folder("Movies");

        FileSystemComponent movie1 = new File("Titanic.mp4");
        FileSystemComponent movie2 = new File("Joker.mp4");
        FileSystemComponent movie3 = new File("The Fault in Our Stars.mp4");

        movie.addFileOrFolder(movie1);
        movie.addFileOrFolder(movie2);
        movie.addFileOrFolder(movie3);


        Folder music = new Folder("Music");

        Folder artcell = new Folder("Artcell");
        FileSystemComponent music1 = new File("Odekha Shorgo.mp3");
        FileSystemComponent music2 = new File("Obosh Onuvutir Deyal.mp3");
        FileSystemComponent music3 = new File("Poth Chola.mp3");

        artcell.addFileOrFolder(music1);
        artcell.addFileOrFolder(music2);
        artcell.addFileOrFolder(music3);

        Folder warfaze = new Folder("Warfaze");
        FileSystemComponent music4 = new File("Purnota.mp3");
        FileSystemComponent music5 = new File("Rupkotha.mp3");

        warfaze.addFileOrFolder(music4);
        warfaze.addFileOrFolder(music5);

        music.addFileOrFolder(artcell);
        music.addFileOrFolder(warfaze);

        document.addFileOrFolder(movie);
        document.addFileOrFolder(music);

        FileSystemComponent file1 = new File("File1.txt");
        FileSystemComponent file2 = new File("File2.txt");

        document.addFileOrFolder(file1);
        document.addFileOrFolder(file2);

        document.showDetails();

    }
}
