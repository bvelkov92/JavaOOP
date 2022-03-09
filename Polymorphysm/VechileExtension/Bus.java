package Vehicles;

public class Bus extends VehicleImpl{
    public Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
        setFuelConsumption(fuelConsumption);
    }
}
