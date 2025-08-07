import java.util.ArrayList;

public class Level2Q5 {
    static class CartItem {
        String itemName;
        double price;
        int quantity;

        CartItem(String itemName, double price, int quantity) {
            this.itemName = itemName;
            this.price = price;
            this.quantity = quantity;
        }

        double getTotalCost() {
            return price * quantity;
        }

        void displayItem() {
            System.out.println(itemName + " - ₹" + price + " x " + quantity + " = ₹" + getTotalCost());
        }
    }

    public static void main(String[] args) {
        ArrayList<CartItem> cart = new ArrayList<>();
        cart.add(new CartItem("Notebook", 50.0, 3));
        cart.add(new CartItem("Pen", 10.0, 5));

        System.out.println("Cart Items:");
        double totalCost = 0;
        for (CartItem item : cart) {
            item.displayItem();
            totalCost += item.getTotalCost();
        }

        System.out.println("Total Cost: ₹" + totalCost);
    }
}
