package Vehicles;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] inputArr = scanner.nextLine().split(" ");
        double fuelQuantity =Double.parseDouble(inputArr[1]);
        double fuelConsumption =Double.parseDouble(inputArr[2]);

        VehicleImpl car = new Car(fuelQuantity,fuelConsumption);

        inputArr = scanner.nextLine().split(" ");
         fuelQuantity =Double.parseDouble(inputArr[1]);
         fuelConsumption =Double.parseDouble(inputArr[2]);

         VehicleImpl truck = new Truck(fuelQuantity,fuelConsumption);

         int numCommands = Integer.parseInt(scanner.nextLine());

         while (numCommands-->0){

             String [] inputCommand = scanner.nextLine().split(" ");
             String function = inputCommand[0];
             String clazz = inputCommand[1];
             double litresOrKm = Double.parseDouble(inputCommand[2]);
             switch (function){
                 case "Drive":
                     if (clazz.equals("Car")){
                         System.out.println(car.driving(litresOrKm));
                     }else if (clazz.equals("Truck"))
                         System.out.println(truck.driving(litresOrKm));
                     break;
                 case "Refuel":
                     if (clazz.equals("Car")){
                         car.refuel(litresOrKm);
                     }else if (clazz.equals("Truck")){
                         truck.refuel(litresOrKm);
                     }
                     break;
             }
         }
        System.out.printf("%s: %.2f%n%s: %.2f", car.getClass().getSimpleName(), car.getFuelQuantity()
                ,truck.getClass().getSimpleName(),truck.getFuelQuantity());
    }
}
