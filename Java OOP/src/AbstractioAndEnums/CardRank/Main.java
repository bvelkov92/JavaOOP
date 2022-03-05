package AbstractioAndEnums.CardRank;

public class Main {
    public static void main(String[] args) {

        System.out.println("Card Ranks:");
        CardRank [] cardRank = CardRank.values();
        for (CardRank card:cardRank) {
            System.out.printf("Ordinal value: %d; Name value: %s%n",card.ordinal(),card);
        }
    }
}
