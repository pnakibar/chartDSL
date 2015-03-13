package gen;

import org.jfree.chart.JFreeChart;

/**
 * Created by pedronakibar on 12/03/15.
 */
public interface Data {
    public void add(String... data);

    public JFreeChart createChart(String title);
}
