package Vehicles;

public class NotEmptyBus extends  Bus{

    public static final double AC_ADDITIONAL_CONSUMPTION=1.4;
    public NotEmptyBus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption+AC_ADDITIONAL_CONSUMPTION, tankCapacity);
    }


}
