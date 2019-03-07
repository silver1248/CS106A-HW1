package testRun;

import java.util.Random;

import io.vavr.collection.List;

public class DiceRoller2 {

    final static int sides = 8;
    final static int numberOfDice = 3;
    final static List<String> stats = List.of(
            "STRENGTH", 
            "DEXTERITY", 
            "CONSTITUTION", 
            "INTELLIGENCE", 
            "WISDOM", 
            "CHARISMA"
    );
    final static List<String> people = List.of(
            "Xavier",
            "Dorian",
            "Will",
            "Collin"
    );

    private static int getRandomBetweenOneAnd(int bound) {
        Random dice = new Random();
        return dice.nextInt(bound) + 1; 
    }
    
    private static int rollDice(int sides, int numberOfDice) {
        int total = 0;
        for (int i = 0; i < numberOfDice; i++) {
            final int holder = getRandomBetweenOneAnd(sides);
            total = total + holder;
        }
        return total;
    }
    
    public static void main(String[] args) {
        for (final String person : people){
            System.out.println();
            System.out.println(person);
            System.out.println();
            for (final String stat : stats) {
                System.out.println(String.format("%-14s: %s", stat, rollDice(sides, numberOfDice)));
            }
        }
        
        
        
        
    }
}
