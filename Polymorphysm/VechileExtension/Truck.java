package Vehicles;

import java.text.DecimalFormat;

public class Truck extends VehicleImpl {
    private static final double AC_ADDITIONAL_CONSUMPTION = 1.6;
    private static final double PERCENT_FUEL_TO_REFUEL = 0.95;

    public Truck(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption+AC_ADDITIONAL_CONSUMPTION,tankCapacity);

    }

    @Override
    public void refuel(double litres){
        if (litres<=0){
            System.out.println("Fuel must be a positive number");
            return;
        }else if(super.getFuelQuantity()+(litres*PERCENT_FUEL_TO_REFUEL)>this.getTankCapacity()){
            System.out.println("Cannot fit fuel in tank");
            return;
        }
        super.setFuelQuantity(getFuelQuantity()+(litres*PERCENT_FUEL_TO_REFUEL));
    }
}

