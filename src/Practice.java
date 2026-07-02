import java.util.HashMap;

public class Practice {
    public static void main(String[] args) {
        HashMap<String, Integer> microsoft = new HashMap<>();

        microsoft.put("Shayaan", 2004); // the String here is known as a key and
        microsoft.put("Youngpyung", 1994); // the integer here is known as a value
        microsoft.put("Cristie", 1990);

        System.out.println(microsoft);
        System.out.println(microsoft.get("Shayaan"));
        System.out.println(microsoft.containsKey("Zak"));
        System.out.println(microsoft.containsValue(1994));

        // can replace a value by redeclaring it in the map

        microsoft.put("Cristie", 000);
        System.out.println(microsoft);

    }
}