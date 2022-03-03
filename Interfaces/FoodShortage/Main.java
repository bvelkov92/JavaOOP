package Interface.FoodShortage;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Citizen> citizenList = new ArrayList<>();
        List<Rebel> rebelList = new ArrayList<>();
         Scanner scanner = new Scanner(System.in);

         int input = Integer.parseInt(scanner.nextLine());

         while (input-->0){

             String[] inputArr = scanner.nextLine().split("\\s+");

             if (inputArr.length==4){
                 addCitizen(inputArr,citizenList);
             }else {
                addRebel(inputArr,rebelList);
             }
         }
         String inputName = scanner.nextLine();
         while (!inputName.equals("End")){
             for (Citizen object: citizenList) {
                 if (object.getName().equals(inputName)){
                    object.buyFood();
                 }
             }
             for (Rebel object:rebelList) {
                 if (object.getName().equals(inputName)){
                     object.buyFood();
                 }
             }

             inputName = scanner.nextLine();
         }
        int finalFood=0;
         finalFood+=numberFoodsCitizen(citizenList);
         finalFood+=numberFoodsRebel(rebelList);

        System.out.println(finalFood);

    }
    public static void addCitizen(String[] inputArr, List<Citizen> list){
        String name = inputArr[0];
        int age =Integer.parseInt(inputArr[1]);
        String id = inputArr[2];
        String birthDate = inputArr[3];
        Citizen citizen = new Citizen(name,age,id,birthDate);
        list.add(citizen);
    }

    public static void  addRebel(String[] inputArr, List<Rebel> rebelList){
        String name = inputArr[0];
        int age = Integer.parseInt(inputArr[1]);
        String group = inputArr[2];

        Rebel rebel = new Rebel(name,age,group);
        rebelList.add(rebel);
    }

    public static int numberFoodsCitizen( List<Citizen> list){
        int foods = 0;
        for (Citizen object:list) {
            foods+=object.getFood();
        }
        return foods;
    }

    public static  int numberFoodsRebel(List<Rebel> list){
        int foods = 0;
        for (Rebel object: list) {
            foods+= object.getFood();
        }
        return foods;
    }
=======
public class Main {
>>>>>>> f2d244ef6c9673509418a0103555d2e1613704ef
}
