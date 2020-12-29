package kata2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        int [] data = {1, 2, 14, 14, 5, 6, 3, 8, 9, 4, 1, 2, 3, 14, 5};
        
        Histogram meta_histogram = new Histogram(data);
        
               
        Map<Integer, Integer> histogram = meta_histogram.getHistogram(data);
        
        Iterator<Map.Entry<Integer, Integer>> entries = histogram.entrySet().iterator();
        while (entries.hasNext()) { 
            Map.Entry<Integer, Integer> entry = entries.next();
            System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
        }
    }
    
}

