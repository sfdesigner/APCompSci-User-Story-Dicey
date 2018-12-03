import java.util.Random;

public class Main {

    // create a random number generator
    public static Random rand;

    public static void main(String[] args) {
        // initialize the random number generator
        rand = new Random();
        
        // output the result of a roll, with inline rolling and combo testing
        System.out.printf("A pair %s rolled.",checkRoll(rollDie(),rollDie(),rollDie()) ? "was" : "was not");
    }

    /**
     * Method to check the 
     * @param a int; die one
     * @param b int; die two
     * @param c int; die three
     * @return boolean; true if pairs exists
     */
    public static boolean checkRoll(int a, int b, int c) {
        // test if a pair exists
        if (a == b || a == c || b == c) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Roll a virtual 6-sided die
     * @return int; virtual 6d die roll
     */
    public static int rollDie() {
        // generate a virtual 6d die roll
        int x = rand.nextInt(7);
        
        // output die roll
        System.out.printf("Die: %d\n",x);
        
        // return value of die rolla
        return x;
    }
}
