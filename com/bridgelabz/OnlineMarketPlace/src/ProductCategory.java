package com.bridgelabz.OnlineMarketPlace.src;

abstract class ProductCategory {
    private String name;

    public ProductCategory(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
