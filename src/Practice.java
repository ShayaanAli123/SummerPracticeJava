import java.util.HashMap;

public class Practice {
    public static void main(String[] args) {
        // for Strings and Integers have to write out Integer not int 
        // because HashMap is a generic class and it can only take objects not primitive data types
        // this is a map of names and the year born in
        HashMap<String, Integer> microsoft = new HashMap<>();

        microsoft.put("Zak", 2004); // the String here is known as a key and
        microsoft.put("Youngpyung", 1994); // the integer here is known as a value
        microsoft.put("Cristie", 1990);

        System.out.println(microsoft);
        System.out.println(microsoft.get("Shayaan"));
        System.out.println(microsoft.containsKey("Zak"));
        System.out.println(microsoft.containsValue(1994));

        // can replace a value by redeclaring it in the map

        microsoft.put("Cristie", 000);
        System.out.println(microsoft);


        // replace method can be used to change a value in the map
        microsoft.replace("Zak", 2005);
        System.out.println(microsoft);
        // put if absent method can be used to add new key if not already there
        microsoft.putIfAbsent("Hamzah Ali", 2003);
        System.out.println(microsoft);
        // remove method used to remove a key and its value from the map
        microsoft.remove("Hamzah Ali");
        System.out.println(microsoft);
    }
}