package PizzaCalories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private List<Topping> toppings;

    public Pizza(String name, int numberOfToppings) {
    setName(name);
    setToppings(numberOfToppings);
    }

    private void setToppings(int numberOfToppings) {
        if (numberOfToppings<0 || numberOfToppings>10){
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }else {
            this.toppings = new ArrayList<>(numberOfToppings);
        }
    }
    private void setName(String name) {
        if (name.trim().length()>=1 && name.trim().length()<=15){
            this.name = name;
        }else {
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public String getName() {
        return name;
    }

    public void addTopping(Topping topping){
        toppings.add(topping);
    }

    public double getOverallCalories(){
return this.dough.calculateCalories()*this.toppings.stream().mapToDouble(Topping::CalculateCalories).sum();
    }

}
