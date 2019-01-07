package testRun;

public class BeeperInMiddle extends Karel {

    static {
        room = new int[] {7,7,7,7,7,7,7};
    }

    public static void main(String[] args) {
        int length = getLength();
        turnLeft();
        int height = getLength();
        turnAround();
        move(height/2);
        turnRight();
        move(length/2);
        putBeeper();
    }

    public static void move(int distance) {
        for (int i = 0; i < distance; i++) {
            move();
        }
    }
    public static void turnAround() {
        turnLeft();
        turnLeft();
    }
    public static int getLength() {
        int m = 1;
        while (notBlockedByWall()) {
            m++;
            move();
        }
        return m;
    }
    
    private static void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }

}
