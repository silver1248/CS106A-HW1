package testRun;

public class BeeperInMiddle extends Karel {

    static {
        room = new int[] {5,6,7,6,5,6,7,6,5,6,7,6,5};
    }
    
    public static void main(String[] args) {
        int length = getLength();
        turnAround();
        move(length/2);
        if (even(length)) {
            putBeeper();            
            move();
            putBeeper();            
        } else {
            putBeeper();            
        }
    }
    
    private static boolean even(int length) {
        return length % 2 == 0;
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

        
    
//    public static void goToWall() {
//        while(notBlockedByWall()) {
//            move();
//        }
//    }
//
//    public static void countMoves() {
//
//        int m = 0;
//        if (notBlockedByWall())
//            m++;
//        }
//    }
//    public static void turnAroundAndCount() {
//        
//            
//        }
//    }
}
