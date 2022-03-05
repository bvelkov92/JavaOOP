package Interface.FoodShortage;

public class Rebel implements Buyer,Person{
    public static final int DEFAULT_START_FOOD=0;

    private String name;
    private int age;
    private String group;
    private int food;

    public Rebel(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public void buyFood() {
        this.food=this.food+5;
    }

    public int getFood() {
        return food;
    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

}
