package Vehicles;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final double AC_ADDITIONAL_CONSUMPTION=1.4;

        Scanner scanner = new Scanner(System.in);

         String [] inputArr = scanner.nextLine().split(" ");
         double fuelQuantity =Double.parseDouble(inputArr[1]);
         double fuelConsumption =Double.parseDouble(inputArr[2]);
         double tankCapacity = Double.parseDouble(inputArr[3]);
         VehicleImpl car = new Car(fuelQuantity,fuelConsumption, tankCapacity);

         inputArr = scanner.nextLine().split(" ");
         fuelQuantity =Double.parseDouble(inputArr[1]);
         fuelConsumption =Double.parseDouble(inputArr[2]);
        tankCapacity = Double.parseDouble(inputArr[3]);
         VehicleImpl truck = new Truck(fuelQuantity,fuelConsumption,tankCapacity);

         inputArr = scanner.nextLine().split(" ");
         fuelQuantity =Double.parseDouble(inputArr[1]);
         fuelConsumption =Double.parseDouble(inputArr[2]);
        tankCapacity = Double.parseDouble(inputArr[3]);
         VehicleImpl bus = new Bus(fuelQuantity,fuelConsumption,tankCapacity);

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
                     }else if (clazz.equals("Truck")) {
                         System.out.println(truck.driving(litresOrKm));
                     }else if (clazz.equals("Bus")) {
                         double lastConsumption = bus.getFuelConsumption();
                         bus.setFuelConsumption(bus.getFuelConsumption() + AC_ADDITIONAL_CONSUMPTION);
                         System.out.println(bus.driving(litresOrKm));
                         bus.setFuelConsumption(lastConsumption);
                     }
                     break;

                 case "DriveEmpty":
                    if (clazz.equals("Bus")){
                        System.out.println(bus.driving(litresOrKm));
                    }
                     break;
                 case "Refuel":
                     if (clazz.equals("Car")){
                         car.refuel(litresOrKm);
                     }else if (clazz.equals("Truck")){
                         truck.refuel(litresOrKm);
                     }else if(clazz.equals("Bus")){
                         bus.refuel(litresOrKm);
                     }
                     break;
             }
         }
        System.out.printf("%s: %.2f%n%s: %.2f%n%s: %.2f", car.getClass().getSimpleName(), car.getFuelQuantity()
                ,truck.getClass().getSimpleName(),truck.getFuelQuantity(),
                bus.getClass().getSimpleName(),bus.getFuelQuantity());
    }
}
