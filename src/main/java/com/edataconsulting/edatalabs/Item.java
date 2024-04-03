package com.edataconsulting.edatalabs;

public class Item {
    Double grossPrice;
    Double discount;
    Double taxRate;

    public Item (Double grossPrice, Double discount, Double taxRate) {
        this.grossPrice = grossPrice;
        this.discount = discount;
        this.taxRate = taxRate;
    }
}
