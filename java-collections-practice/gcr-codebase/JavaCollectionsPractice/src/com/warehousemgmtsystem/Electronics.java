package com.warehousemgmtsystem;
class Electronics extends WarehouseItem {
    public Electronics(String itemId, String name) {
        super(itemId, name);
    }

    public String getCategory() {
        return "Electronics";
    }
}

class Groceries extends WarehouseItem {
    public Groceries(String itemId, String name) {
        super(itemId, name);
    }

    public String getCategory() {
        return "Groceries";
    }
}

class Furniture extends WarehouseItem {
    public Furniture(String itemId, String name) {
        super(itemId, name);
    }

    public String getCategory() {
        return "Furniture";
    }
}
