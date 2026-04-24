import java.util.*;
// Handles undo actions using a stack

public class MenuEditor {
    private Stack<String> undoStack = new Stack<>();
// Record an action
    public void recordAction(String action) {
        undoStack.push(action);
    }
// Undo the last action

    public void undo() {
        if (!undoStack.isEmpty()) {
            System.out.println("Undoing: " + undoStack.pop());
        } else {
            System.out.println("Nothing to undo.");
        }
    }
}
