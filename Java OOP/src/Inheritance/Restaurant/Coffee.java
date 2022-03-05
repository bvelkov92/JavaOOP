package Inheritance.Restaurant;

import java.math.BigDecimal;

public class Coffee extends  HotBeverage{
    public static final double COFFEE_MILLILITERS = 50;
    public static final BigDecimal COFFEE_PRICE = BigDecimal.valueOf(3.50);
    private double caffeine;


    public Coffee(String name,double caffeine) {
        super(name, COFFEE_PRICE, COFFEE_MILLILITERS);
        this.caffeine = caffeine;
    }

    public Coffee(String name, BigDecimal price, double milliliters) {
        super(name, price, milliliters);

    }

    public double getCaffeine() {
        return caffeine;
    }
}
