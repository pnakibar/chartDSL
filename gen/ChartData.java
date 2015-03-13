package gen;

import java.util.HashMap;

/**
 * Created by pedronakibar on 12/03/15.
 */
public class ChartData implements Data{
    private HashMap<String, HashMap<String, Double>> outer =
            new HashMap<String, HashMap<String, Double>>();

    @Override
    public void add(String... data) {
        String key = data[0];
        HashMap<String, Double> inner = outer.get(key);
        if (inner == null){
            inner = new HashMap<String, Double>();
            outer.put(key, inner);
        }
        inner.put(data[1], new Double(data[2]));
    }

    @Override
    public String toString(){
        return outer.toString();

    }
}
