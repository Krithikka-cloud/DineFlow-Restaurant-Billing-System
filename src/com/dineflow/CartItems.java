package com.dineflow;

public class CartItems {

    private String itemName;
    private int qty;
    private int price;

    public CartItems(String itemName, int qty, int price) {
        this.itemName = itemName;
        this.qty = qty;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public int getQty() {
        return qty;
    }

    public int getPrice() {
        return price;
    }

    public int getTotal() {
        return qty * price;
    }
}
