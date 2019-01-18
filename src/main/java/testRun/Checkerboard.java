package testRun;

public class Checkerboard extends Karel {

    static {
        room = new int[] {3,3,3};
    }

    public static void main(String[] args) {
        boolean facingEast = true;
        boolean notInCorner = true;
        boolean shouldPutBeeper = true;
        while (notInCorner) {
            moveToWall(shouldPutBeeper);
            notInCorner = goUp(facingEast);
            facingEast = !facingEast;
            shouldPutBeeper = notBlockedByWall();
        }
    }

    private static boolean goUp(boolean facingEast) {
        turn(facingEast);
        if (notBlockedByWall()) {
            move(shouldPutBeeper);
            turn(facingEast);
            return true;
        } else {
            return false;
        }
    }

    private static void turn(boolean facingEast) {
        if (facingEast) {
            turnLeft();
        } else {
            turnRight();
        }
    }

    private static boolean moveToWall(boolean shouldPutBeeper) {
        while (notBlockedByWall()) {
            shouldPutBeeper = !shouldPutBeeper;
            if (shouldPutBeeper) {
                putBeeper();
            }
            move();
        }
        shouldPutBeeper = !shouldPutBeeper;
        return shouldPutBeeper;
    }
    private static void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public static void move(boolean shouldPutBeeper) {
        move();
        shouldPutBeeper = !shouldPutBeeper;
    }

}