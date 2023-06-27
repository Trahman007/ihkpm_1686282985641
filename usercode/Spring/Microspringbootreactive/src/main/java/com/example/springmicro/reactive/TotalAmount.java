package com.example.springmicro.reactive;

public class TotalAmount {
    private Item item;
    private CartItem cartItem;
    private double discount = 0.05;
    private double taxAmount = 1.102;

    public TotalAmount(Item item, CartItem cartItem) {
        this.item = item;
        this.cartItem = cartItem;
    }

    public double totalAmountDue() {
        double totalAmount = item.getPrice() * cartItem.getQuantity();
        totalAmount *= discount * taxAmount;
        return totalAmount;
    }
}
