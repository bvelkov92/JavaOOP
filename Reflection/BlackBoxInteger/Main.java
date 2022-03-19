package blackBoxInteger;

import java.lang.reflect.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {

         Scanner scanner = new Scanner(System.in);
         String command = scanner.nextLine();
         Class<BlackBoxInt> clazz = BlackBoxInt.class;
         Constructor<BlackBoxInt> constructor = clazz.getDeclaredConstructor();
         constructor.setAccessible(true);
         BlackBoxInt blackBoxInt = constructor.newInstance();

        while (!command.equals("END")){
             String modify = command.split("_")[0];
             int number = Integer.parseInt(command.split("_")[1]);

            Field innerValue = clazz.getDeclaredField("innerValue");

             switch (modify){

                 case "add":
                     runCommand("add",clazz,blackBoxInt,number);
                     printResult(blackBoxInt, innerValue);
                     break;
                 case "subtract":
                     runCommand("subtract", clazz, blackBoxInt, number);
                     printResult(blackBoxInt, innerValue);
                     break;
                 case "divide":
                     runCommand("divide", clazz, blackBoxInt, number);
                     printResult(blackBoxInt, innerValue);
                     break;
                 case "multiply":
                     runCommand("multiply", clazz, blackBoxInt, number);
                     printResult(blackBoxInt, innerValue);
                     break;
                 case "rightShift":
                     runCommand("rightShift", clazz, blackBoxInt, number);
                     printResult(blackBoxInt, innerValue);
                     break;
                 case "leftShift":
                     runCommand("leftShift", clazz, blackBoxInt, number);
                     printResult(blackBoxInt, innerValue);
                     break;
             }

             command= scanner.nextLine();
         }

    }

    private static void runCommand(String command, Class<BlackBoxInt> clazz, BlackBoxInt blackBoxInt, int number) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        List<Method> methods = Arrays.asList(clazz.getDeclaredMethods());
        Method currentMethod = null;
        for (Method method: methods){
            if (method.getName().equals(command)){
                currentMethod=method;
                break;
            }
        }
        currentMethod.setAccessible(true);
        currentMethod.invoke(blackBoxInt,number);
    }

    private static void printResult(Object blackBoxInt, Field innerValue) throws IllegalAccessException {
        innerValue.setAccessible(true);
        System.out.println(innerValue.get(blackBoxInt));
    }
}
