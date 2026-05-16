import java.util.HashMap;
import java.util.Map;

public class HashMapPrac {
    public static void main(String[] args) {

        // HashMap = A collection of key-value pairs
                    // Keys are unique, but values can be repeated
        //              Does not maintain any order, but is memory efficient
        //              HashMap<Key, Value>

        HashMap<String, Double> map = new HashMap<>();

        map.put("Apple", 60.99);
        map.put("Laptop", 1860.99);
        map.put("Book", 79.99);
        map.put("Coconut", 1.99);

        // remove with key allow
       // map.remove("Coconut");

        // to get value associated with key (we can use key methods)

       // System.out.println(map.get("Book"));

       // System.out.println(map.containsKey("Laptop"));

      //  System.out.println(map.containsValue(1860.99));

     //   if (map.containsKey("Grape")) {
       //     System.out.println(map.get("Grape"));
     //   }
      //  else {
      //      System.out.println("Key not found");
      //  }

       // System.out.println(map.size());

       for(Map.Entry<String, Double> entry : map.entrySet()) {
           System.out.println(entry.getKey() + " : N" + entry.getValue());
       }



    }
}
