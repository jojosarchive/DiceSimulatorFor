import java.util.Random;

/**
 * This class simulates rolling a pair of dice 10,000 times
 * and counts the number of times doubles of are rolled for
 * each different pair of doubles.
 */

public class DiceSimulationFor {
    public static void main(String[] args) {
        final int NUMBER = 10000;  // number of dice rolls

        // a random number generator used in simulating the rolling of dice
        Random generator = new Random();

        int die1Value;       // value of the first die
        int die2Value;       // value of the second die
        int count;       // total number of dice rolls
        int snakeEyes = 0;   // number of snake eyes rolls
        int twos = 0;        // number of double two rolls
        int threes = 0;      // number of double three rolls
        int fours = 0;       // number of double four rolls
        int fives = 0;       // number of double five rolls
        int sixes = 0;       // number of double six rolls


        for (count = 0; count < NUMBER; count++) {
            die1Value = generator.nextInt(6);
            die1Value++;
            die2Value = generator.nextInt(6);
            die2Value++;


            if (die1Value == 1 && die2Value == 1) {
                snakeEyes++;

            } else if (die1Value == 2 && die2Value == 2) {
                twos++;

            } else if (die1Value == 3 && die2Value == 3) {
                threes++;

            } else if (die1Value == 4 && die2Value == 4) {
                fours++;

            } else if (die1Value == 5 && die2Value == 5) {
                fives++;

            } else if (die1Value == 6 && die2Value == 6) {
                sixes++;

            }
        }


        // results
        System.out.println("You rolled snake eyes " +
                snakeEyes + " out of " +
                count + " rolls.");
        System.out.println("You rolled double twos " +
                twos + " out of " + count +
                " rolls.");
        System.out.println("You rolled double threes " +
                threes + " out of " + count +
                " rolls.");
        System.out.println("You rolled double fours " +
                fours + " out of " + count +
                " rolls.");
        System.out.println("You rolled double fives " +
                fives + " out of " + count +
                " rolls.");
        System.out.println("You rolled double sixes " +
                sixes + " out of " + count +
                " rolls.");
    }
}
