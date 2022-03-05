package AbstractioAndEnums.CardSuits;

public class Main {
    public static void main(String[] args) {


        System.out.println("Card Suits:");

        Cards [] cardSuits = Cards.values();
        for (Cards card: cardSuits){
            System.out.printf("Ordinal value: %d; Name value: %s%n", card.ordinal(),card);
        }
    }
}
