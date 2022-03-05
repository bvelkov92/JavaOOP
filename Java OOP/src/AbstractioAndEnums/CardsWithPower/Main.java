package AbstractioAndEnums.CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String cardRank = scanner.nextLine();
         String cardSuit = scanner.nextLine();

        System.out.printf("Card name: %s of %s; Card power: %d%n", CardRank.valueOf(cardRank),CardSuit.valueOf(cardSuit),
                CardRank.valueOf(cardRank).getRankPower()+CardSuit.valueOf(cardSuit).getSuitPower());
    }
}
