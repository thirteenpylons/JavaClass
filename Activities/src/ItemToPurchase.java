/*
Create a program using classes that does the following in the zyLabs developer
below. For this lab, you will be working with two different class files.
To switch files, look for where it says "Current File" at the top of the
developer window. Click the current file name, then select the file you need.

(1) Create two files to submit:

ItemToPurchase.java - Class definition
ShoppingCartPrinter.java - Contains main() method
Build the ItemToPurchase class with the following specifications:

Private fields
String itemName - Initialized in default constructor to "none"
int itemPrice - Initialized in default constructor to 0
int itemQuantity - Initialized in default constructor to 0
Default constructor
Public member methods (mutators & accessors)
setName() & getName() (2 pts)
setPrice() & getPrice() (2 pts)
setQuantity() & getQuantity() (2 pts)
(2) In main(), prompt the user for two items and create two objects of the
ItemToPurchase class. Before prompting for the second item,
call scnr.nextLine(); to allow the user to input a new string. (2 pts)

Ex:

Item 1
Enter the item name: Chocolate Chips
Enter the item price: 3
Enter the item quantity: 1

Item 2
Enter the item name: Bottled Water
Enter the item price: 1
Enter the item quantity: 10

(3) Add the costs of the two items together and output the total cost. (2 pts)

Ex:

TOTAL COST
Chocolate Chips 1 @ $3 = $3
Bottled Water 10 @ $1 = $10

Total: $13

 */

public class ItemToPurchase {
    private String itemName;
    private int itemPrice;
    private int itemQuantity;

    public ItemToPurchase() {
        this.itemName = "none";
        this.itemPrice = 0;
        this.itemQuantity = 0;
    }

    public String getName() {
        return itemName;
    }

    public void setName(String itemName) {
        this.itemName = itemName;
    }

    public int getPrice() {
        return itemPrice;
    }

    public void setPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getQuantity() {
        return itemQuantity;
    }

    public void setQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    //print item to purchase

    public void printItemPurchase() {
        System.out.println(itemQuantity + " " + itemName + " $" + itemPrice +
                " = $" + (itemPrice * itemQuantity));
    }
}
