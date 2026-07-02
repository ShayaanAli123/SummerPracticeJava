import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class SetsAndHashSets {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Shayaan");
        names.add("Shayaan");
        names.add("Youngpyung");
        names.add("Zak");
        

        System.out.println(names);

        //now if u want to do someth to the whole set
        // enhanced for loop

        Iterator<String> namesIterator = names.iterator();
        while (namesIterator.hasNext()){
            System.out.println(namesIterator.next());
        }
        
    }
}

// sets by design do not allow duplicates
// cant just do names.remove(a index) because sets arent ordered
// like a list. 