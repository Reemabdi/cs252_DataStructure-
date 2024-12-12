import lab3.Item;

public class ShoppingCart {

    private static final int MAX_SIZE = 10;
    private Item[] items = new Item[MAX_SIZE];
    private int itemCount = 0;

    public boolean addItem(Item item1) {
        if (this.itemCount < MAX_SIZE) {
            this.items[this.itemCount++] = item1;
            System.out.println("Item successfully added to your cart");
            return true;
        } else {
            System.out.println("Failed to add, your cart is full");
            return false;
        }
    }

    public boolean removeItem(String itemId) {

        for (int i = 0; i < itemCount; i++) {
            if (items[i].getId().equals(itemId)) {
                itemCount--;
                if (i != itemCount)
                    items[i] = items[itemCount];
                items[itemCount] = null;
                System.out.println("Item successfully removed from your cart");
                return true;
            }
        }
        System.out.println("Failed to remove, the item not found in your cart");
        return false;
    }

    
    public void viewItems() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        String cartItems = "There are " + itemCount + " item(s) in your cart.\n";
        for (int i = 0; i < itemCount; i++) {
            cartItems += (i + 1) + " -" + items[i];
        }
        return cartItems;
    }

    public int getItemCount() {
        return itemCount;
    }

}

