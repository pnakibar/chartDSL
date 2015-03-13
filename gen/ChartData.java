package gen;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import java.util.HashMap;

/**
 * Created by pedronakibar on 12/03/15.
 */
public class ChartData implements Data{
    private HashMap<String, HashMap<String, Double>> outer =
            new HashMap<String, HashMap<String, Double>>();
    private String title = "Title";
    private String domainAxisLabel = "X";
    private String rangeAxisLabel = "Y";


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
    public JFreeChart createChart(String title) {
        DefaultCategoryDataset objDataset = new DefaultCategoryDataset();

        for (String keyouter: outer.keySet()){
            HashMap<String, Double> inner = outer.get(keyouter);
            for (String keyinner: inner.keySet()){
                objDataset.setValue(inner.get(keyinner),keyinner,keyouter);
            }
        }

        JFreeChart objChart = ChartFactory.createBarChart(
                this.title,     //Chart title
                this.domainAxisLabel,     //Domain axis label
                this.rangeAxisLabel,         //Range axis label
                objDataset,         //Chart Dataset
                PlotOrientation.VERTICAL, // orientation
                true,             // include legend?
                true,             // include tooltips?
                false             // include URLs?
        );

        return objChart;
    }

    @Override
    public String toString(){
        return outer.toString();

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRangeAxisLabel() {
        return rangeAxisLabel;
    }

    public void setRangeAxisLabel(String rangeAxisLabel) {
        this.rangeAxisLabel = rangeAxisLabel;
    }

    public String getDomainAxisLabel() {
        return domainAxisLabel;
    }

    public void setDomainAxisLabel(String domainAxisLabel) {
        this.domainAxisLabel = domainAxisLabel;
    }
}
