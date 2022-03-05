package AbstractioAndEnums.TrafficLights;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String [] inputLights =scanner.nextLine().split("\\s+");
         int numberChanges = Integer.parseInt(scanner.nextLine());

         List<Color> trafficLight = new ArrayList<>();
        for (String light:inputLights) {
            Color currentLight = Color.valueOf(light);
            trafficLight.add(currentLight);
        }

         while (numberChanges-->0){
             for (int i = 0; i < trafficLight.size(); i++) {
                 trafficLight.set(i, Color.valueOf(trafficLight.get(i).nextLight));
                 System.out.print(trafficLight.get(i) +" ");
             }
             System.out.println();
        }
    }
}
