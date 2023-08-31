/*
 * File: MazeSolvingKarel.java
 * -----------------------------
 * The MazeSolvingKarelFinal class extends the basic Karel class
 * so that Karel solves a maze.
 */
import stanford.karel.*;

public class MazeSolvingKarel extends SuperKarel {

    public void run() {
        while (!beeperPresent()) {
            if (rightIsClear()) {
                turnRight();
                move();
            } else if (frontIsClear()) {
                move();
            } else {
                turnLeft();
            }
        }
    }  
}
