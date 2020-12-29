package kata2;

import java.util.HashMap;
import java.util.Map;

class Histogram {

    private final int [] data;

    public Histogram(int[] data) {
        this.data = data;
    }

    public int[] getData() {
        return data;
    }

    Map<Integer, Integer> getHistogram(int[] data) {
               
        Map<Integer, Integer> histogram = new HashMap<>();
        
        for (int i = 0; i < data.length; i++) {
            histogram.put(data[i], histogram.containsKey(i) ? histogram.get(data[i]) + 1 : 1);
        }
        return histogram;
    }
}


