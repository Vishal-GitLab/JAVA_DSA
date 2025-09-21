package src.Practice.Challenge.Challenge_73;

public class Dice {

    // This method simulates rolling a dice
        int roll() {

            // Math.random() gives a random double between 0.0 and 1.0 (not including 1.0)
            // Multiplying by 6 makes it between 0.0 and 5.999...
        double random = Math.random() * 6;

            // Math.ceil(random) rounds the number up to the next integer
            // Possible values: 1.0 to 6.0
            // Casting (int) converts it from double to int
            return    (int) Math.ceil(random);
    }

    public static void main(String[] args) {
        // Create a Dice object to use the roll() method
        Dice dice = new Dice();
        for (int i = 1; i < 10; i++ ) {
            // Print the dice roll result each time
            System.out.println(dice.roll());
        }
    }

}