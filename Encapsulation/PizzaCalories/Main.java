package PizzaCalories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       String[] pizzaDetails = scanner.nextLine().split(" ");
       Pizza pizza = new Pizza(pizzaDetails[1],Integer.parseInt(pizzaDetails[2]));

       String[] doughDetails = scanner.nextLine().split(" ");
       Dough dough = new Dough(doughDetails[0],doughDetails[1],Integer.parseInt(doughDetails[2]));

       String nextInput = scanner.nextLine();
       while (!nextInput.equals("END")) {
           String[] toppingDetails = scanner.nextLine().split(" ");
           Topping topping = new Topping(toppingDetails[1],Double.parseDouble(toppingDetails[2]));
        pizza.addTopping(topping);

        nextInput= scanner.nextLine();
       }

        System.out.printf("%s - %.2f",pizza.getName(),pizza.getOverallCalories());
    }
}
