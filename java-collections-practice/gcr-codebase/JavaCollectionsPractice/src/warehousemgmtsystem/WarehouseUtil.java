package warehousemgmtsystem;

import java.util.List;

class WarehouseUtil {
    public static void displayItems(List<? extends WarehouseItem> items) {
        if (items.isEmpty()) {
            System.out.println("No items available.");
            return;
        }
        for (WarehouseItem item : items) {
            System.out.println(item);
        }
    }
}
