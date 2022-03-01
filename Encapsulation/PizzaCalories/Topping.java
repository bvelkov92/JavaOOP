package PizzaCalories;

public class Topping {
private String	toppingType;
private double	weight;

    public Topping(String toppingType, double weight) {
    setToppingType(toppingType);
    setWeight(weight);
    }

private void setToppingType (String toppingType){
        switch (toppingType){
            case "Meat":
            case "Veggies":
            case "Cheese":
            case "Sauce":
                this.toppingType = toppingType;
                break;
            default:
                throw new IllegalArgumentException("Cannot place " +toppingType +" on top of your pizza.");
        }
    }
 private void setWeight (double weight){
    if (weight>0 && weight<=50){
        this.weight = weight;
    }else {
        String message = getToppingType() +" weight should be in the range [1..50].";
        throw new IllegalArgumentException(message);
    }
 }
public double CalculateCalories (){
        double caloriesPerGram=0;
        switch (getToppingType()){
            case "Meat":
            caloriesPerGram=1.2;
            break;
            case "Veggies":
                caloriesPerGram=0.8;
                break;
            case "Cheese":
                caloriesPerGram = 1.1;
                break;
            case "Sauce":
                caloriesPerGram=0.9;
                break;
        }
        return 2*caloriesPerGram*weight;
}

    public String getToppingType() {
        return toppingType;
    }
}
