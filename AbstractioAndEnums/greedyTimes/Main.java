
package AbstractioAndEnums.greedyTimes;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long entry = Long.parseLong(scanner.nextLine());
        String[] inputArr = scanner.nextLine().split("\\s+");

        LinkedHashMap<String, LinkedHashMap<String, Long>> bagMap = new LinkedHashMap<>();
        long gold = 0;
        long diamonds = 0;
        long money = 0;

        for (int i = 0; i < inputArr.length; i += 2) {
            String name = inputArr[i];
            long currenNumber = Long.parseLong(inputArr[i + 1]);

            String value = "";

            if (name.length() == 3) {
                value = "Cash";
            } else if (name.toLowerCase().endsWith("gem")) {
                value = "Gem";
            } else if (name.toLowerCase().equals("gold")) {
                value = "Gold";
            }

            if (value.equals("")) {
                continue;
            } else if (entry < bagMap.values().stream().map(Map::values).flatMap(Collection::stream).mapToLong(e -> e).sum() + currenNumber) {
                continue;
            }

            switch (value) {
                case "Gem": {
                    String contain = "Gold";
                    if (action(bagMap, currenNumber, value, contain, "Gold")) continue;
                    break;
                }
                case "Cash": {
                    String contain = "Gem";
                    if (action(bagMap, currenNumber, value, contain, "Gem")) continue;
                    break;
                }
            }
            containsValue(bagMap, value);
            containsNameFromValue(bagMap, name, value);


            bagMap.get(value).put(name, bagMap.get(value).get(name) + currenNumber);
            if (value.equals("Gold")) {
                gold += currenNumber;
            } else if (value.equals("Gem")) {
                diamonds += currenNumber;
            } else if (value.equals("Cash")) {
                money += currenNumber;
            }
        }

        bagMap.forEach((key, value) -> {
            Long sumValues = value.values().stream().mapToLong(l -> l).sum();

            System.out.printf("<%s> $%s%n", key, sumValues);

            List<Map.Entry<String, Long>> toSort = new ArrayList<>(value.entrySet());
            toSort.sort((e1, e2) -> e2.getKey().compareTo(e1.getKey()));
            for (Map.Entry<String, Long> i : toSort) {
                System.out.println("##" + i.getKey() + " - " + i.getValue());
            }
        });
    }

    private static void containsNameFromValue(LinkedHashMap<String, LinkedHashMap<String, Long>> bagMap, String name, String value) {
        if (!bagMap.get(value).containsKey(name)) {
            bagMap.get(value).put(name, 0L);
        }
    }

    private static void containsValue(LinkedHashMap<String, LinkedHashMap<String, Long>> bagMap, String value) {
        if (!bagMap.containsKey(value)) {
            bagMap.put(value, new LinkedHashMap<>());
        }
    }

    private static boolean action(LinkedHashMap<String, LinkedHashMap<String, Long>> bagMap, long currenNumber, String value, String contain, String gold2) {
        if (!bagMap.containsKey(value)) {
            if (bagMap.containsKey(contain)) {
                if (currenNumber > bagMap.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                    return true;
                }
            } else {
                return true;
            }
        } else if (bagMap.get(value).values().stream().mapToLong(e -> e).sum() + currenNumber > bagMap.get(gold2).values().stream().mapToLong(e -> e).sum()) {
            return true;
        }
        return false;
    }
}