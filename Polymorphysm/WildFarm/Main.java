package WildFarm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Animal> animals = new ArrayList<>();

        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String[] inputArr = command.split(" ");
            Animal animal = createAnimal(inputArr);

            String[] inputFood = scanner.nextLine().split(" ");
            String foodType = inputFood[0];
            int quantity = Integer.parseInt(inputFood[1]);
            Food food = createFood(foodType, quantity);
            animal.makeSound();

            try {
                animal.eat(food);
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
            animals.add(animal);
            command = scanner.nextLine();
        }
        animals.forEach(System.out::println);
    }

    private static Food createFood(String foodType, int quantity) {
        if (foodType.equals("Vegetable")) {
            Food vegetable = new Vegetable(quantity);
            return vegetable;
        }
            Food meat = new Meat(quantity);
        return meat;
    }

    private static void printSound(Animal tiger) {
        System.out.println(tiger);
    }

    public static Animal createAnimal(String[] tokens) {
        String animalType = tokens[0];
        String animalName = tokens[1];
        double animalWeight = Double.parseDouble(tokens[2]);
        String animalLivingRegion = tokens[3];

        switch (animalType) {
            case "Mouse":
                return new Mouse(animalName, animalType, animalWeight, animalLivingRegion);
            case "Cat":
                return new Cat(animalName, animalType, animalWeight, animalLivingRegion, tokens[4]);
            case "Zebra":
                return new Zebra(animalName, animalType, animalWeight, animalLivingRegion);
            case "Tiger":
                return new Tiger(animalName, animalType, animalWeight, animalLivingRegion);
            default:
                throw new IllegalArgumentException("No such animal");
        }
    }
}

