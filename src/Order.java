import java.util.ArrayList;

public class Order {
    private ArrayList<Menu> orderMenus;

    public Order() {
        orderMenus = new ArrayList<>();
    }

    public void addMenuOrder(Menu menu) {
        orderMenus.add(menu);
    }

    public ArrayList<Menu> getOrderMenus() {
        return orderMenus;
    }

    public double totalAmount() {
        double totalAmount = 0;
        for (Menu menu : orderMenus) {
            totalAmount += menu.getPrice();
        }
        return totalAmount;
    }

}
