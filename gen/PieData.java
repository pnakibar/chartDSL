package gen;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

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
    public JFreeChart createChart(String title) {
        DefaultPieDataset pieDataset = new DefaultPieDataset( );

        for (String key: dataset.keySet()){
            pieDataset.setValue(key, dataset.get(key));
        }

        JFreeChart chart = ChartFactory.createPieChart(
                title, // chart title
                pieDataset, // data
                true, // include legend
                true,
                false);


        return chart;
    }

    @Override
    public String toString(){
        return dataset.toString();

    }


}

