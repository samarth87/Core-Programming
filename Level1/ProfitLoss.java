package Level1;

import java.util.*;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Cost Price (INR): ");
        double costPrice = input.nextDouble();
        System.out.print("Enter the Selling Price (INR): ");
        double sellingPrice = input.nextDouble();
        double profit = sellingPrice - costPrice;
        double profitPercentage = (profit / costPrice) * 100;
        System.out.println(
                "The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\n" +
                        "The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage + "%"
        );
    }
}

