/*
 * File: UnevenRoadRepairKarel.java
 * -----------------------------
 * The UnevenRoadRepairKarel class extends the basic Karel class
 * so that Karel fills a pothole with a beeper.
 */

import stanford.karel.*;

public class UnevenRoadRepairKarel extends SuperKarel {

	public void run() {
		
		/*for (int a = 0; a<5;a++){
			move();
			fillPothole();
			move();
		}*/
		
		while (frontIsClear()){
			move();
			if (rightIsClear() && noBeepersPresent()){
				fillPothole();	
			}
			move();	
		}
	fillPothole();
}
	
	public void fillPothole(){ //decomposition
		
		turnRight();
		move();
		putBeeper();
		turnAround();
		move();
		turnRight();	
	} 
}

