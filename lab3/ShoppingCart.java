package lab3;
//import Item;

public class ShoppingCart {

    private SinglyLinkedList<Item> items = new SinglyLinkedList<Item>();

    public void addItem(Item item1) {

        this.items.addLast(item1);// BIG O(1)
        System.out.println("Item successfully added to your cart");
    }

    public boolean removeItem(String itemId) {//Big O (n^2)

        items.moveToStart();
        for (int i = 0; i < items.size(); i++) {//Big O(n)
            if (items.getValue().getId().equals(itemId)) {
                items.remove(i);//Big O(n)
                System.out.println("Item successfully removed from your cart");
                return true;
            }
            items.next();
        }
        System.out.println("Failed to remove, the item not found in your cart");
        return false;
    }

    public void viewItems() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        String cartItems = "There are " + items.size() + " item(s) in your cart.\n";
        items.moveToStart();
        for (int i = 0; i < items.size(); i++) {//Big O(n)
            cartItems += (i + 1) + " -" + items.getValue();
            items.next();
        }
        return cartItems;
    }

    public int getItemCount() {//Big O(1)
        return items.size();
    }


}
