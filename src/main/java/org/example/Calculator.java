package org.example;
import static org.assertj.core.api.Assertions.*;

public class Calculator {
    double sum;
    double discount;

    public Calculator (double sum, double discount) {
        this.sum = sum;
        this.discount = discount;
    }

    private double getDiscount () {
        return this.discount;
    }

    public double calculateDiscount() {
        double price = this.sum * (1 - this.discount/100);
        assert this.discount >= 0:"ArithmeticException";
        assert this.discount <= 100:"ArithmeticException";
        assert this.sum > 0:"ArithmeticException";
        return price;
    }
}
