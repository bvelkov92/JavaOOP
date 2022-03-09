package Vehicles;

public class Car extends VehicleImpl{
private static final double AC_ADDITIONAL_CONSUMPTION=0.9;


    public Car(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption+AC_ADDITIONAL_CONSUMPTION);

    }

    @Override
    public void refuel(double litres){
        super.setFuelQuantity(super.getFuelQuantity()+litres);
    }

}
