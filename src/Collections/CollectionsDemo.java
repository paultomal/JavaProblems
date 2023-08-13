package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {
    public static void show(){
        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection ,"a" , "b", "c");
        for (var items : collection)
            System.out.println(items);
        //System.out.println(collection);
    }
}
