import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Opgave18 {
    public static void main(String[] args) {
        Map<String,String> map1 = new HashMap<>();
        map1.put("Anne","54");
        map1.put("Andreas", "22");
        map1.put("Kasper", "28");
        reverse(map1);



    }

    public static Map reverse(Map<String,String> a)
    {
        Map<String,String> map2 = new HashMap<>();
        Iterator it = a.entrySet().iterator();

        while (it.hasNext()) //
        {
            Map.Entry P = (Map.Entry)it.next(); //
            map2.put(P.getValue().toString(),P.getKey().toString()); // sætter værdien sådan at den gamle value er = den nye key, og den gamle key er = den nye value altså byttet om på værdierne
        }
        System.out.println(map2); // udskriver map for at se om den har byttet om på værdierne
        return map2;
    }
}
