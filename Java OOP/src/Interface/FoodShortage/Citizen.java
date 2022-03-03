package Interface.FoodShortage;
public class Citizen extends Alpha  {

    private String id;
    private String birthDate;
    private int food;

    public Citizen(String name, int age, String id, String birthDate, int food) {
       super(name,age);
        this.id = id;
        this.birthDate = birthDate;
        this.food = food;
    }


}
