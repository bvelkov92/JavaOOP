package PizzaCalories;

public class Dough {

    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        setFlourType(flourType);
        setBakingTechnique(bakingTechnique);
        setWeight(weight);
    }

    private void setWeight(double weight) {
        if (weight > 0 && weight <= 200) {
            this.weight = weight;
        } else {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
    }

    private void setFlourType(String flourType) {
        switch (flourType) {
            case "White":
            case "Wholegrain":
                this.flourType = flourType;
                break;
            default:
                throw new IllegalArgumentException("Invalid type of dough.");
        }
    }
    private void setBakingTechnique(String bakingTechnique) {
        switch (bakingTechnique) {
            case "Crispy":
            case "Chewy":
            case "Homemade":
                this.bakingTechnique = bakingTechnique;
                break;
            default:
                throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    public double calculateCalories() {
        double caloriesPerGramFlour = 0;
        switch (flourType) {
            case "White":
                caloriesPerGramFlour = 1.5;
                break;
            case "Wholegrain":
                caloriesPerGramFlour = 1.0;
                break;
        }
        double caloriesPerGramBakings=0;
        switch (bakingTechnique) {
            case "Crispy":
                caloriesPerGramBakings = 0.9;
                break;
            case "Chewy":
                caloriesPerGramBakings = 1.1;
                break;
            case "Homemade":
                caloriesPerGramBakings = 1.0;
                break;
        }

        return 2*weight* caloriesPerGramFlour*caloriesPerGramBakings;
    }

}
