package testRun;

import java.util.Random;

public class DiceRoller2 {

    /*
     * This is correct, don't change this
     */
    private static int getRandomBetweenOneAnd(int bound) {
        Random dice = new Random();
        return dice.nextInt(6) + 1; 
    }
    private static int rollDice(int sides, int numberOfDice) {
        for (int i = 0; i <= numberOfDice; i++) {
            getRandomBetweenOneAnd(6);
        }
        return getRandomBetweenOneAnd(6);
    }
    
    /**
     * This is correct, don't change this.  Running this should produce the output below.  Note that
     * the final line is from the main method, so it's the lines above that we should get from what 
     * you're writing.  Also, as a hint, you're going to have a loop and an accumulator.  They way I
     * wrote it has nine lines including the declaration and close curly brace.
     * 
     * As another hint, work in this order: <OL>
     * <LI> First just write something that returns the number 4.
     * <LI> See how the output looks.
     * <LI> Then something that returns a random number between 1 and bound.
     * <LI> Then something that returns the total of numberOfDice (random numbers between 1 and bound)s.
     * <LI> Then something that outputs the right thing.
     * <LI> Then you'll be done.
     * </OL>
     * 
     * The stuff in the PRE block is what your code should output (with different numbers)
     * <PRE>
     * 1
     * 4
     * 4
     * 6
     * 
     * The result of 4, 6 sided dice is: 15
     * </PRE>
     */
    public static void main(String[] args) {
        int sides = 6;
        int numberOfDice = 4;
        System.out.println("\nThe result of "+numberOfDice+", "+sides+" sided dice is: " 
                + rollDice(sides, numberOfDice));
    }
}
