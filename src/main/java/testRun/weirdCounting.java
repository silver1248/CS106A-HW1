package testRun;


public class weirdCounting {
    private static void count() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            for(int j = 1; j <= i; j++) {
                System.out.println("\t" + j);
            }
        }
    }


    public static void main(String[] args) {
        count();
    }

}
