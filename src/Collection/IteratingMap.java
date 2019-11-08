package Collection;

import java.util.HashMap;
import java.util.Map;
public class IteratingMap {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        map1.put("Name", "John");
        map1.put("Age", "22");
        map1.put("Gender", "Male");
        
        // Map is not iterable ,
        // we need to get something iterable out of the map
        // to loop through the map
        // --->>> VIEW
        // KeySet , Value , entrySet
        
        System.out.println(map1);
        
        System.out.println(map1.keySet());
        System.out.println( map1.get("Gender"));
        
        for (String keyValue : map1.keySet() ) {
            System.out.println(  "key :" + keyValue + " \t| value :" + map1.get(keyValue));
            
        }
        public static void main(Integer[] args) {
         int a = 4;
          System.err.println();
          
        
        
        
    }
}