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
        if (facingEast) {
            if (goUpLeft()) {
                return true;
            } else {
                return false;
            }
        } else {
            if (goUpRight()) {
                return true;
            } else {
                return false;
            }
        }
    }

    private static void moveToWall() {
        while (notBlockedByWall()) {
            move();
        }
    }
    public static boolean goUpLeft()  {
        turnLeft();
        if (notBlockedByWall()) {
            move();
            turnLeft();
            return true;
        } else {
            return false;
        }
    }
    public static boolean goUpRight()  {
        turnRight();
        if (notBlockedByWall()) {
            move();
            turnRight();
            return true;
        } else {
            return false;
        }
    }
    private static void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }

}
