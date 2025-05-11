package com.example.designpattern.PrototypePattern.With;


/**
 * <h2>✅ Advantages of Using the Prototype Pattern</h2>
 *
 * <ol>
 *   <li>
 *     <strong>Encapsulates Object Copy Logic</strong><br>
 *     Each class is responsible for copying itself by implementing the <code>Prototype&lt;T&gt;</code> interface.<br><br>
 *     <pre><code>
 * public class GamePiece implements Prototype&lt;GamePiece&gt; {
 *     public GamePiece clone() {
 *         return new GamePiece(color, position);
 *     }
 * }
 *     </code></pre>
 *     This ensures that the copy logic is localized, and the client (e.g., <code>GameBoard</code>) doesn't have to know internal details.
 *   </li>
 *
 *   <li>
 *     <strong>Reduces Duplication in Cloning Logic</strong><br>
 *     Instead of manually duplicating objects field by field in the client code:
 *     <pre><code>
 * for (GamePiece gp : gameBoard.getGamePieces()) {
 *     copiedBoard.addPiece(new GamePiece(gp.getColor(), gp.getPosition()));
 * }
 *     </code></pre>
 *     The code becomes cleaner and reusable:
 *     <pre><code>
 * GameBoard copiedBoard = gameBoard.clone();
 *     </code></pre>
 *   </li>
 *
 *   <li>
 *     <strong>Follows Open/Closed Principle (OCP)</strong><br>
 *     The client (main method or <code>GameBoard</code>) remains closed for modification. New logic for cloning new types of components only needs changes within the class itself (e.g., <code>GamePiece</code>), not in the board or main logic.
 *   </li>
 *
 *   <li>
 *     <strong>Enables Deep Cloning with Flexibility</strong><br>
 *     The pattern supports deep cloning as shown here:
 *     <pre><code>
 * for (GamePiece gamePiece : gamePieces) {
 *     newBoard.addPiece(gamePiece.clone());
 * }
 *     </code></pre>
 *     This allows full duplication of nested objects without shared references — avoiding shallow copy bugs.
 *   </li>
 *
 *   <li>
 *     <strong>Improves Maintainability and Extensibility</strong><br>
 *     If cloning behavior changes (e.g., GamePiece starts having images or animation states), changes stay inside <code>clone()</code>. No need to modify cloning logic across multiple places.
 *   </li>
 *
 *   <li>
 *     <strong>Better Abstraction and Reuse</strong><br>
 *     The Prototype interface promotes reuse across different models:
 *     <pre><code>
 * public interface Prototype&lt;T&gt; {
 *     T clone();
 * }
 *     </code></pre>
 *     Any new class (e.g., <code>Enemy</code>, <code>UIComponent</code>, etc.) can implement this and gain consistent cloning capability.
 *   </li>
 * </ol>
 */

public class WithPrototypePattern {
    public static void main(String[] args) {
        System.out.println("------- With Prototype Pattern -------");

        GameBoard gameBoard = new GameBoard();
        gameBoard.addPiece(new GamePiece("Red", 1));
        gameBoard.addPiece(new GamePiece("Green", 3));

        gameBoard.showBoardState();

        GameBoard copiedBoard = gameBoard.clone();
        System.out.println("\n----- Copied Board -----");
        copiedBoard.showBoardState();
    }
}
