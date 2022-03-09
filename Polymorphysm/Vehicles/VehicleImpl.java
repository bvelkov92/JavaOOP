package Vehicles;

import java.text.DecimalFormat;

public abstract class VehicleImpl implements Vehicle{

    private double fuelQuantity;

    private double fuelConsumption;


    public VehicleImpl(double fuelQuantity, double fuelConsumption) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
    }

    public String driving(double distance) {
        double neededFuel = fuelConsumption*distance;
        if (neededFuel>this.fuelQuantity){
            return String.format("%s needs refueling", this.getClass().getSimpleName());
        }
        this.fuelQuantity-=neededFuel;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        return String.format("%s travelled %s km", this.getClass().getSimpleName(), decimalFormat.format(distance));
    }


    public void refuel(double litres) {
        this.fuelQuantity+=litres;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
