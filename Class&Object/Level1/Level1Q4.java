public class Level1Q4 {
    static class Item {
        String itemCode;
        String itemName;
        double price;

        Item(String itemCode, String itemName, double price) {
            this.itemCode = itemCode;
            this.itemName = itemName;
            this.price = price;
        }

        void displayDetails(int quantity) {
            System.out.println("Item Code: " + itemCode);
            System.out.println("Item Name: " + itemName);
            System.out.println("Price per Unit: ₹" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Total Cost: ₹" + (price * quantity));
        }
    }

    public static void main(String[] args) {
        Item item = new Item("I123", "Pen", 10.0);
        item.displayDetails(5);
    }
}
