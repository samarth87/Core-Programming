package Level1;
//Rewrite program 8 to do the countdown using the for-loop

public class Level1Q9 {
    public static void main(String[] args) {
        int counter = 10; // Example input for countdown
        for (int i = counter; i > 0; i--) {
            System.out.println("Countdown: " + i);
        }
        System.out.println("Liftoff!");
    }    
}
