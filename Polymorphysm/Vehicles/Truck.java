package Vehicles;

import java.text.DecimalFormat;

public class Truck extends VehicleImpl {
    private static final double AC_ADDITIONAL_CONSUMPTION = 1.6;
    private static final double PERCENT_FUEL_TO_REFUEL = 0.95;

    public Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption+AC_ADDITIONAL_CONSUMPTION);

    }

    @Override
    public void refuel(double litres){
        super.setFuelQuantity(getFuelQuantity()+(litres*PERCENT_FUEL_TO_REFUEL));
    }
}

