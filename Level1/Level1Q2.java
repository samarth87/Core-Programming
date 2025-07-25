package Level1;


public class Level1Q2 {
   public static void main(String[] args) {
        int number1 = 10;
        int number2 = 20;
        int number3 = 30;

        boolean isFirstSmallest = (number1 < number2) && (number1 < number3);

        System.out.println("Is the first number the smallest? " + isFirstSmallest);
    } 
}
