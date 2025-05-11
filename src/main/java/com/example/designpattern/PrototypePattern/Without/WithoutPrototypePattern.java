package com.example.designpattern.PrototypePattern.Without;

/**
 * <h2>🔧 Problems Without Using the Prototype Pattern</h2>
 *
 * <ol style="font-size: 1.2em;">
 *
 *   <li>
 *     <strong>Manual Cloning Logic Is Required</strong><br>
 *     The duplication of objects must be done manually using constructors and getters. This becomes tedious and error-prone as more fields are added.
 *     <br><br>
 *     <strong>Example:</strong>
 *     <pre><code>
 * GamePiece copied = new GamePiece(original.getColor(), original.getPosition());
 *     </code></pre>
 *     If additional fields are introduced, the cloning logic must be updated everywhere it’s used.
 *   </li>
 *
 *   <li>
 *     <strong>DRY Principle Is Violated</strong><br>
 *     The same copy logic is duplicated throughout the codebase. This leads to redundancy and increases maintenance effort.
 *     <br><br>
 *     <strong>Example:</strong>
 *     <pre><code>
 * GameBoard copiedBoard = new GameBoard();
 * for (GamePiece gamePiece : originalBoard.getGamePieces()) {
 *     copiedBoard.addPiece(new GamePiece(gamePiece.getColor(), gamePiece.getPosition()));
 * }
 *     </code></pre>
 *     If <code>GamePiece</code> changes, this loop and similar ones elsewhere must also be modified.
 *   </li>
 *
 *   <li>
 *     <strong>Encapsulation Is Compromised</strong><br>
 *     In order to manually copy fields, all internal properties must be exposed through getters — breaking encapsulation and exposing implementation details.
 *     <br><br>
 *     <strong>Example:</strong>
 *     <pre><code>
 * String color = gamePiece.getColor(); // exposes internal state
 * int position = gamePiece.getPosition();
 *     </code></pre>
 *     Ideally, the class should hide internal details and provide a single method for duplication.
 *   </li>
 *
 *   <li>
 *     <strong>Polymorphism and Reusability Are Lost</strong><br>
 *     Without a common cloning interface, different classes cannot be copied through a shared abstraction. This limits reuse and flexibility.
 *     <br><br>
 *     <strong>Example:</strong>
 *     <pre><code>
 * // This is NOT possible without a common interface:
 * List&lt;CloneablePiece&gt; pieces;
 * CloneablePiece copy = pieces.get(0).clone();
 *     </code></pre>
 *     Each class must instead be handled individually.
 *   </li>
 *
 *   <li>
 *     <strong>Code Becomes Harder to Scale</strong><br>
 *     As more components are introduced (e.g., <code>GameToken</code>, <code>Obstacle</code>), each one requires custom cloning logic. This results in repetitive, bloated code that’s hard to scale and maintain.
 *     <br><br>
 *     <strong>Example:</strong>
 *     <pre><code>
 * tokenBoard.addToken(new GameToken(originalToken.getType(), originalToken.getStrength()));
 *     </code></pre>
 *     Without a prototype mechanism, each new class duplicates the same pattern of constructor-based cloning.
 *   </li>
 * </ol>
 */

public class WithoutPrototypePattern {
    public static void main(String[] args) {
        System.out.println("------- Without Prototype Pattern -------");
        GameBoard gameBoard = new GameBoard();

        gameBoard.addPiece(new GamePiece("Red", 1));
        gameBoard.addPiece(new GamePiece("Blue", 2));


        gameBoard.showBoardState();

        // Checkpoint this state
        GameBoard copiedBoard = new GameBoard();

        for (GamePiece gamePiece: gameBoard.getGamePieces()) {
            copiedBoard.addPiece(new GamePiece(gamePiece.getColor(), gamePiece.getPosition()));
        }


        System.out.println("\n----- Copied Board -----");
        copiedBoard.showBoardState();

    }
}
