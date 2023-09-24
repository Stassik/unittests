package org.example;

public class ShopTest {

    /*
   1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
    */
    public void assertList(Shop shop) {
        assert !shop.getProducts().isEmpty():"Список пуст";
        for (int i = 0; i < shop.getProducts().size(); i++) {
            assert shop.getProducts().get(i).getCost() >= 0:"Отрицательная стоимость";
            assert !shop.getProducts().get(i).getTitle().isEmpty():"Отсутствует название продукта";
        }
    }
    /*
   2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
   */
    public void assertMostExpensiveProduct(Shop shop, Product mostExpensiveProduct) {
        for (int i = 0; i < shop.getProducts().size(); i++) {
            assert mostExpensiveProduct.getCost() >= shop.getProducts().get(i).getCost():"Ошибка";
        }
    }
   /*
   3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
   */
    public void assertSort(Shop shop) {
        for (int i = 1; i < shop.getProducts().size(); i++) {
            assert shop.getProducts().get(i).getCost() >= shop.getProducts().get(i - 1).getCost():"Ошибка сортировки";
        }
    }

}