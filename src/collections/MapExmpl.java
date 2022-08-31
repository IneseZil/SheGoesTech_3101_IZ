package collections;

import java.util.HashMap;
import java.util.Map;

public class MapExmpl {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        //Add values to map
        map.put("John Smith", 3000);
        map.put("Queen Bee", 2093);

        //Print out
        System.out.println(map);

        //Get value from key
        System.out.println("John's salary: "+map.get("John Smith"));

        //List all the keys in the map
        System.out.println(map.keySet());

        //All values in map
        System.out.println(map.values());

        //Size of the map
        System.out.println(map.size());

        //Find a value (key/value)
        System.out.println(map.containsKey("Agdg"));
        System.out.println(map.containsKey("Queen Bee"));
        System.out.println(map.containsValue(2678));
        System.out.println(map.containsValue(2093));

        //Remove element (key/value pair)
        map.remove("John Smith");
        System.out.println(map);

        //Example

        Map<String , String> capitalCity = new HashMap<>();
        capitalCity.put("Estonia", "Tallinn");
        capitalCity.put("Latvia", "Riga");
        capitalCity.put("Lithuania", "Vilnius");
        capitalCity.put("FakeEstonia", "Tallinn");

        System.out.println(capitalCity.get("Estonia"));

        for (Map.Entry<String,String> entry: capitalCity.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        //Print out keys where value is Tallinn
        for (Map.Entry<String, String> entry: capitalCity.entrySet()){
            if(entry.getValue().equals("Tallinn")){
                System.out.println(entry.getKey());
            }

        }

    }
}
