import java.util.Random;

public class sale {

    public static void main(String[] args) {
        // Create a Random object to generate random numbers
        Random random = new Random();

        // Generate a random integer
        int randomInt = random.nextInt(100); // Random number between 0 and 99
        System.out.println("Random Integer (0-99): " + randomInt);

        // Generate a random double
        double randomDouble = random.nextDouble(); // Random number between 0.0 and 1.0
        System.out.println("Random Double (0.0-1.0): " + randomDouble);

        // Generate a random boolean
        boolean randomBoolean = random.nextBoolean(); // Random true or false
        System.out.println("Random Boolean: " + randomBoolean);
    }
}
