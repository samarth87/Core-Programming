package Level1;

import java.util.*;

public class DiscountCourseFee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the course fee (INR): ");
        double fee = input.nextDouble();
        System.out.print("Enter the discount percentage: ");
        double discountPercent = input.nextDouble();
        double discount = (fee * discountPercent) / 100;
        double discountedPrice = fee - discount;
        System.out.println("The discount amount is INR " + discount +
                " and the fee to be paid after discount is INR " + discountedPrice);
    }
}
