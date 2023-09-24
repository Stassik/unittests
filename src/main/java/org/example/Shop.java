package org.example;

import java.util.Comparator;
import java.util.List;

public class Shop {
    private List<Product> products;


    public Shop (List<Product> products) {
        this.products = products;
    }

    // Геттеры, сеттеры:
    public List<Product> getProducts() {
        return this.products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }




    // Метод должен вернуть отсортированный по возрастанию по цене список продуктов
    public List<Product> sortProductsByPrice() {
        for (int i = 0; i < this.products.size() - 1; i++) {
            for (int j = i + 1; j < this.products.size(); j++) {
                if (this.products.get(i).getCost() > this.products.get(j).getCost()) {
                    int tempCost = this.products.get(i).getCost();
                    String tempTitle = this.products.get(i).getTitle();
                    this.products.get(i).setCost(this.products.get(j).getCost());
                    this.products.get(i).setTitle(this.products.get(j).getTitle());
                    this.products.get(j).setCost(tempCost);
                    this.products.get(j).setTitle(tempTitle);
                }
            }
        }
        return null;
    }

    // Метод должен вернуть самый дорогой продукт
    public Product getMostExpensiveProduct() {
        int maxCost = this.products.get(0).getCost();
        int maxIndex = 0;
        for (int i = 1; i < this.products.size() - 1; i++) {
            if (this.products.get(i).getCost() > maxCost) {
                maxCost = this.products.get(i).getCost();
                maxIndex = i;
            }
        }
        Product mostExpensiveProduct = this.products.get(maxIndex);
        return mostExpensiveProduct;
    }

}