package com.bridgelabz.OnlineMarketPlace.src;

import java.util.ArrayList;
import java.util.List;

public class OnlineMarketplace {
    public static void main(String[] args) {
        List<Product<?>> catalog = new ArrayList<>();

        Product<BookCategory> book = new Product<>("Java Programming", 39.99, new BookCategory());
        Product<ClothingCategory> shirt = new Product<>("Casual Shirt", 19.99, new ClothingCategory());
        Product<GadgetCategory> smartphone = new Product<>("Smartphone", 499.99, new GadgetCategory());

        catalog.add(book);
        catalog.add(shirt);
        catalog.add(smartphone);

        System.out.println("Catalog before discount:");
        for (Product<?> product : catalog) {
            System.out.println(product);
        }

        DiscountUtil.applyDiscount(book, 10);
        DiscountUtil.applyDiscount(shirt, 15);
        DiscountUtil.applyDiscount(smartphone, 5);

        System.out.println("\nCatalog after discount:");
        for (Product<?> product : catalog) {
            System.out.println(product);
        }
    }
}