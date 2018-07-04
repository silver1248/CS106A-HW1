package testRun;


public class CS106A2Karel extends Karel {
    static {
        room = new int[] {5,3,3,3,6};
    }

	public static void main(String[] args) {
		while (notBlockedByWall() || notBlockedOnLeft()){
			turnLeft();
			goToCeiling();
			goToFloor();
			goToNextColumn();
		}
	}

	private static void goToCeiling() {
		while (notBlockedByWall()) {
			if (noBeepersPresent()) {
				putBeeper();
			}
			move();
		}
	}

	private static void goToFloor(){
		turnAround();
		while (notBlockedByWall()) {
			move();
		}
	}

	private static void goToNextColumn(){
		turnLeft();
		move4();
		turnLeft();
	}

	private static void move4(){
		move();
		move();
		move();
		move();
	}

	private static void turnAround(){
		turnLeft();
		turnLeft();
	}
	
	private static void turnRight(){
	turnLeft();
	turnLeft();
	turnLeft();
	}
	
	private static boolean noBeepersPresent(){
		System.out.println("noBeeperspresent");
		return true;
	}

	private static void putBeeper(){
		System.out.println("putBeeper");
	}
	
	private static boolean notBlockedOnLeft(){
		turnLeft();
		boolean notBlocked = notBlockedByWall();
		turnRight();
		return notBlocked;
	}


	private static boolean notBlockedOnLeft2(){
		turnLeft();
		if (notBlockedByWall()) {
			turnRight();
			return true;
		} else {
			turnRight();
			return false;
		}
	}

	private static boolean notBlockedOnLeft3(){
		turnLeft();
		return turnRightThenValue(notBlockedByWall());
	}

	private static boolean turnRightThenValue(boolean notBlockedByWall) {
		turnRight();
		return notBlockedByWall;
	}
}