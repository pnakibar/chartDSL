package gen;

import java.util.HashMap;

/**
 * Created by pedronakibar on 12/03/15.
 */
public class PieData implements Data {
    private HashMap<String, Double> dataset = new HashMap<String, Double>();

    @Override
    public void add(String... data) {
        dataset.put(new String(data[0]),new Double(data[1]));
    }

    @Override
    public String toString(){
        return dataset.toString();

    }


}

