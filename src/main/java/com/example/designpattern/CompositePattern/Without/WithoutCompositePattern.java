package com.example.designpattern.CompositePattern.Without;


/**
 * Demonstrates a file-folder structure implementation without the use of the Composite Pattern.
 *
 * <p>
 * This example shows how a `Folder` object manually manages a list of `File` objects.
 * While it may seem functional for flat structures, it introduces multiple limitations in a scalable or hierarchical system.
 * </p>
 *
 * <h2>1. No Common Abstraction</h2>
 * <p>
 * `File` and `Folder` do not implement a shared interface or superclass with a common method like {@code showDetails()}.
 * As a result, the client cannot treat them uniformly.
 * </p>
 *
 * <pre>{@code
 * File file1 = new File("File1.txt");
 * Folder folder = new Folder("Documents");
 * folder.addFile(file1); // Only files can be added directly
 * }</pre>
 *
 * <h2>2. Rigid Client Logic</h2>
 * <p>
 * The client must know whether it is dealing with a `File` or a `Folder` and act accordingly.
 * If folders had to contain other folders, the logic would become even more complex and harder to maintain.
 * </p>
 *
 * <pre>{@code
 * folder.showDetails(); // Internally loops only over File objects
 * }</pre>
 *
 * <h2>3. No Support for Folder Nesting</h2>
 * <p>
 * Since `Folder` can only store `File` instances, it is not possible to add a `Folder` inside another `Folder`,
 * thus breaking the representation of real-world hierarchical file systems.
 * </p>
 *
 * <pre>{@code
 * Folder subFolder = new Folder("SubFolder");
// folder.addFile(subFolder); // Compilation error — not allowed!
 * }</pre>
 *
 * <h2>4. Violates Open/Closed Principle</h2>
 * <p>
 * If folder nesting is later required, the current `Folder` class must be modified — not simply extended —
 * which violates the Open/Closed Principle.
 * </p>
 *
 * <h2>Summary</h2>
 * <p>
 * This class highlights the inflexibility of not using the Composite Pattern.
 * By introducing a common interface (e.g., {@code Component}) that both `File` and `Folder` implement,
 * developers could treat individual files and entire folder hierarchies uniformly,
 * making the structure far more scalable and extensible.
 * </p>
 *
 * @see com.example.designpattern.CompositePattern.With.WithCompositePattern for a better design using the Composite Pattern.
 */

public class WithoutCompositePattern {
    public static void main(String[] args) {
        System.out.println("-------- Without Composite Pattern --------");

        File file1 = new File("File1.txt");
        File file2 = new File("File2.txt");
        File file3 = new File("File3.txt");

        Folder folder = new Folder("home");
        folder.addFile(file1);
        folder.addFile(file2);
        folder.addFile(file3);

        folder.showDetails();


    }
}
