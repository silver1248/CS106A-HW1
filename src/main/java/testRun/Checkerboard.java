package testRun;

public class Checkerboard extends Karel {

    static {
        room = new int[] {4,4,4,4};
    }

    public static void main(String[] args) {
        boolean facingEast = true;
        boolean notInCorner = true;
        while (notInCorner) {
            moveToWall();
            notInCorner = goUp(facingEast);
            facingEast = !facingEast;
        }
    }

    private static boolean goUp(boolean facingEast) {
        turn(facingEast);
        if (notBlockedByWall()) {
            move();
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

    private static void moveToWall() {
        while (notBlockedByWall()) {
            move();
        }
    }
    private static void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }

}
