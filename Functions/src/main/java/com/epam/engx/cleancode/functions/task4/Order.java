package com.epam.engx.cleancode.functions.task4;

import com.epam.engx.cleancode.functions.task4.thirdpartyjar.Product;

import java.util.Iterator;
import java.util.List;

public class Order {

    private List<Product> products;
    private double orderPrice = 0.0;

    public Double getPriceOfAvailableProducts() {
        orderPrice = getOrderPrice(getAvailableProducts(products));
        return orderPrice;
    }

    private List<Product> getAvailableProducts(List<Product> products) {
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (!product.isAvailable())
                iterator.remove();
        }
        return products;
    }

    private double getOrderPrice(List<Product> products){
        for (Product product : products)
            orderPrice += product.getProductPrice();
        return orderPrice;
    }
    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
