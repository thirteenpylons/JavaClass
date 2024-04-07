import java.util.Scanner;

public class ShoppingCartPrinter {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int i = 0;
        String productName;
        int productPrice = 0;
        int productQuantity = 0;
        int cartTotal = 0;

        ItemToPurchase item1 = new ItemToPurchase();

        System.out.println("Item 1");

        // Get item 1 details from user, create itemToPurchase object
        System.out.println("Enter the item name: ");
        String firstItemName = scnr.nextLine();
        item1.setName(firstItemName);

        System.out.println("Enter the item price: ");
        int firstItemPrice = scnr.nextInt();
        item1.setPrice(firstItemPrice);

        System.out.println("Enter the item quantity: ");
        int firstItemQuantity = scnr.nextInt();
        item1.setQuantity(firstItemQuantity);

        scnr.nextLine();

        System.out.println();

        ItemToPurchase item2 = new ItemToPurchase();

        System.out.println("Item 2");

        // Get item 2 details from user, create itemToPurchase object
        System.out.println("Enter the item name: ");
        String secondItemName = scnr.nextLine();
        item2.setName(secondItemName);

        System.out.println("Enter the item price: ");
        int secondItemPrice = scnr.nextInt();
        item2.setPrice(secondItemPrice);

        System.out.println("Enter the item quantity: ");
        int secondItemQuantity = scnr.nextInt();
        item2.setQuantity(secondItemQuantity);

        int firstItemTotal = item1.getPrice() * item1.getQuantity();
        int secondItemTotal = item2.getPrice() * item2.getQuantity();
        cartTotal = firstItemTotal + secondItemTotal;

        System.out.println();

        System.out.println("TOTAL COST");
        System.out.println(item1.getName() + " " + item1.getQuantity() + " @ $" + item1.getPrice() + " = $" + firstItemTotal);
        System.out.println(item2.getName() + " " + item2.getQuantity() + " @ $" + item2.getPrice() + " = $" + secondItemTotal);

        System.out.println();
        System.out.println("Total: $" + cartTotal);

        return;
    }
}