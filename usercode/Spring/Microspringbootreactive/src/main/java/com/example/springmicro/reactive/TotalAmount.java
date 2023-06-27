package com.example.springmicro.reactive;
import java.util.Objects;
public class TotalAmount {
    private Item item;

    private CartItem cartItem;
    private double totalAmount;
    private final double discount = 0.05;
    private double taxAmount = 1.102;

    public TotalAmount(Item _item){
        super();
        this.item = _item;
    }

    public double totalAmountDue(){
        totalAmount = item.price * cartItem.getQuantity();
        totalAmount = totalAmount*discount*taxAmount;
        return totalAmount;
    }

}
