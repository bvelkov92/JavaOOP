package Interface.FoodShortage;

public class Rebel extends Alpha implements Buyer{

    private String group;
    private int food;

    public Rebel(String name, int age, String group, int food) {
        super(name, age);
        this.group = group;
        this.food = food;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public void buyFood() {

    }

    public int getFood() {
        return food;
    }
}
