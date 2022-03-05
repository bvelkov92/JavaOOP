package AbstractioAndEnums.jediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] matrix = new int[rows][cols];

        int value = 0;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = value++;
            }
        }

        String command = scanner.nextLine();
        long sum = 0;
        while (!command.equals("Let the Force be with you")) {
            int[] goodAnimalCoordinates = Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] evilAnimalCoordinates = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int evilRows = evilAnimalCoordinates[0];
            int evilCols = evilAnimalCoordinates[1];
            changeEvilPosition(matrix, evilRows, evilCols);

            int goodAnimalRows = goodAnimalCoordinates[0];
            int goodAnimalCols = goodAnimalCoordinates[1];

            while (goodAnimalRows >= 0 && goodAnimalCols < matrix[1].length) {
                if (goodAnimalRows < matrix.length && goodAnimalCols >= 0) {
                    sum += matrix[goodAnimalRows][goodAnimalCols];
                }
                goodAnimalCols++;
                goodAnimalRows--;
            }

            command = scanner.nextLine();
        }

        System.out.println(sum);


    }

    private static void changeEvilPosition(int[][] matrix, int evilRows, int evilCols) {
        while (evilRows >= 0 && evilCols >= 0) {
            if (evilRows < matrix.length && evilCols < matrix[0].length) {
                matrix[evilRows][evilCols] = 0;
            }
            evilRows--;
            evilCols--;
        }
    }
}
