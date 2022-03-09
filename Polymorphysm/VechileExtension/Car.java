package Vehicles;

public class Car extends VehicleImpl{
private static final double AC_ADDITIONAL_CONSUMPTION=0.9;


    public Car(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption+AC_ADDITIONAL_CONSUMPTION,tankCapacity);

    }

//    @Override
//    public void refuel(double litres){
//        super.setFuelQuantity(super.getFuelQuantity()+litres);
//    }

}
