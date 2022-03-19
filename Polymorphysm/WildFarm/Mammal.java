package WildFarm;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal{
    String livingRegion;


    public Mammal(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight);
        this.livingRegion = livingRegion;
    }

    @Override
    public String toString() {
        DecimalFormat dF = new DecimalFormat("##.##");
        //"{AnimalType} [{AnimalName}, {AnimalWeight}, {AnimalLivingRegion}, {FoodEaten}]".

       return String.format("%s[%s, %s, %s, %d]",
                this.getClass().getSimpleName(),this.getAnimalName(),dF.format(this.getAnimalWeight()),
                this.livingRegion,this.getFoodEaten());
    }

    public String getLivingRegion() {
        return livingRegion;
    }
}
