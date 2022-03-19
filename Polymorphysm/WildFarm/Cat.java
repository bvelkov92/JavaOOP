package WildFarm;

import java.text.DecimalFormat;

public class Cat extends Felime {

    private String breed;

    public Cat(String animalName, String animalType, double animalWeight,String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }


    @Override
    public String toString() {
        DecimalFormat dF = new DecimalFormat("##.##");
     return String.format("%s[%s, %s, %s, %s, %d]",
                this.getClass().getSimpleName(), this.getAnimalName(), getBreed(), dF.format(getAnimalWeight()),
                this.livingRegion, this.getFoodEaten());
    }

    public String getBreed() {
        return breed;
    }
}
