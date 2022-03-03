package Interface.FoodShortage;
public class Citizen implements Buyer,Person  {
    public static final int DEFAULT_START_FOOD=0;
    private String name;
    private int age;
    private String id;
    private String birthDate;
    private int food;

    public Citizen(String name, int age, String id, String birthDate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthDate = birthDate;
    }

    @Override
    public void buyFood() {
        this.food=this.food+10;
    }

    @Override
    public int getFood() {
        return this.food;
    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    public String getId() {
        return id;
    }

    public String getBirthDate() {
        return birthDate;
    }
}
