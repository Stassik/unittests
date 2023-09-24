package org.example;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

// Задание №1

        Calculator newCalculator = new Calculator(10, 1.5);
        System.out.println(newCalculator.calculateDiscount());



// Задание №2
        List<Product> newListOfProducts = new ArrayList<>();

        newListOfProducts.add(new Product("Яблоко", 100));
        newListOfProducts.add(new Product("Чупа-чупс", 10));
        newListOfProducts.add(new Product("Молоко", 99));
        newListOfProducts.add(new Product("Сыр", 250));
        newListOfProducts.add(new Product("Колбаса", 420));
        newListOfProducts.add(new Product("Леденец", 12));
        newListOfProducts.add(new Product("Йогурт", 42));
        newListOfProducts.add(new Product("Кефир", 80));
        newListOfProducts.add(new Product("Гречка", 110));

        Shop newShop = new Shop(newListOfProducts);
        System.out.println("Список продуктов: ");
        for(int i = 0; i < newShop.getProducts().size(); i++) {
            System.out.println(newShop.getProducts().get(i).getTitle() + " " + newShop.getProducts().get(i).getCost());
        }

        ShopTest shopTest = new ShopTest();
        shopTest.assertList(newShop);

        System.out.println();
        System.out.println("Самый дорогой продукт: ");
        Product mostExpensiveProduct = newShop.getMostExpensiveProduct();
        System.out.println(mostExpensiveProduct.getTitle() + " " + mostExpensiveProduct.getCost());

        ShopTest mostExpensiveProductTest = new ShopTest();
        mostExpensiveProductTest.assertMostExpensiveProduct(newShop, mostExpensiveProduct);


        newShop.sortProductsByPrice();
        System.out.println();
        System.out.println("Список продуктов после сортировки: ");
        for(int i = 0; i < newShop.getProducts().size(); i++) {
            System.out.println(newShop.getProducts().get(i).getTitle() + " " + newShop.getProducts().get(i).getCost());
        }


        ShopTest sortTest = new ShopTest();
        sortTest.assertSort(newShop);




    }




}