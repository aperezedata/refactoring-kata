package com.edataconsulting.edatalabs;

import java.util.List;

public class PriceCalculator {

    public static double calculatePrice(List<Item> items) {
        return items.stream()
                .mapToDouble(PriceCalculator::calculateNetPrice)
                .sum();
    }

    private static Double calculateNetPrice (Item item) {
        return item.grossPrice
                + calculateTax(item.grossPrice, item.taxRate)
                - item.discount;
    }

    private static Double calculateTax(Double grossPrice, Double taxRate) {
        return grossPrice * (taxRate / 100);
    }
}
