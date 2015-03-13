package gen;

/**
 * Created by pedronakibar on 12/03/15.
 */
public class DataFactory {

    public static Data fabricate(String type) {
        type = type.toLowerCase();
        Data data;
        if (type.contentEquals("pie")){
            return new PieData();
        }
        if (type.contentEquals("chart")){
            return new ChartData();
        }
        return null;
    }
}
