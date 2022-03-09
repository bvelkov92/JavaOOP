package Vehicles;
import java.text.DecimalFormat;

public abstract class VehicleImpl implements Vehicle{
    private double fuelQuantity;
    private double fuelConsumption;
    private double tankCapacity;

    public VehicleImpl(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
        this.tankCapacity = tankCapacity;
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

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void refuel(double litres) {
        if (litres<=0){
            System.out.println("Fuel must be a positive number");
            return;
        }
        if (this.getFuelQuantity()+litres>this.getTankCapacity()){
            System.out.println("Cannot fit fuel in tank");
        }else {
            setFuelQuantity(this.getFuelQuantity()+litres);
        }
    }
    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }
}
