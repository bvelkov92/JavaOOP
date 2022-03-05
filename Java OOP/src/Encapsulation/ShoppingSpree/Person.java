package Encapsulation.ShoppingSpree;

import java.util.ArrayList;
import java.util.List;

public class Person{
    private String name;
    private double money;
    private List<Product> products;


    public Person(String name, double money) {
        setName(name);
        setMoney(money);
        products=new ArrayList<>();
    }

    private void setName(String name) {
        if (!name.trim().isEmpty()){
            this.name = name;
        }else {
            throw new IllegalArgumentException("Name cannot be empty");
        }
    }

    private void setMoney(double money) {
        if (money>=0){
            this.money=money;
        }else {
            throw new IllegalArgumentException("Money cannot be negative");
        }
    }

   public void buyProduct (Product product){
    if(product.getCost()<=money){
        this.products.add(product);
        money-=product.getCost();
    }else {
        String message = getName() +" can't afford " +product.getName();
        throw new IllegalArgumentException(message);
    }
    }

    public String getName() {
        return name;
    }
}
