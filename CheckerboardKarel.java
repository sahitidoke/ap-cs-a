/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment Karel4.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {

	public void run() {
		while(frontIsClear() || leftIsClear()){
	checker();
	move();
}
	
	
		

	}
	public void checker(){
		while(frontIsClear()){
			putBeeper();
			if(frontIsBlocked()){
				turnLeft();
			}
			else
			move();
			if(frontIsBlocked()){
				turnLeft();
			}
			else
			move();
			
			
		}
	}

}
