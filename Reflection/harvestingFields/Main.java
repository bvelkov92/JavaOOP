package harvestingFields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String command = scanner.nextLine();

		Map<String, List<Field>> map = getFieldsMap();

		while (!command.equals("HARVEST")) {
			switch (command){
				case "public":
					printField(map,"public");
					break;
				case "private":
					printField(map,"private");
					break;
				case "protected":
					printField(map,"protected");
					break;
				case "all":
					printField(map,"all");
					break;
			}
			command = scanner.nextLine();
		}

	}

	private static void printField(Map<String, List<Field>> map, String key) {
		map.get(key).forEach(field -> {
			System.out.println(Modifier.toString(field.getModifiers())
					+ " "
					+ field.getType().getSimpleName()
					+ " "
					+ field.getName());
		});
	}
	private static Map<String, List<Field>> getFieldsMap() {
		Map<String, List<Field>> map = new HashMap<>();
		List<Field> fieldList = Arrays.asList(RichSoilLand.class.getDeclaredFields());
		map.put("public", new ArrayList<>());
		map.put("private", new ArrayList<>());
		map.put("protected", new ArrayList<>());
		map.put("all", fieldList);

		fieldList.forEach(field -> {
			String modifier = Modifier.toString(field.getModifiers());
			switch (modifier) {
				case "public":
					addFieldInMap(map, field,"public");
					break;
				case "private":
					addFieldInMap(map,field,"private");
					break;
				case "protected":
					addFieldInMap(map,field,"protected");
					break;
				case "all":
					break;
			}
		});
		return map;
	}
	private static void addFieldInMap(Map<String, List<Field>> map, Field field, String key) {
		map.get(key).add(field);
	}
}
