package gen;

import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;

import java.io.File;
import java.io.IOException;

/**
 * Created by pedronakibar on 13/03/15.
 */
public class SavePNG extends Save {

    public SavePNG(String width, String height) {
        super(width, height);
    }
    public SavePNG(Integer width, Integer height) {
        super(width, height);
    }

    @Override
    public void save(String location, JFreeChart chart) throws IOException {
        ChartUtilities.saveChartAsPNG(new File(location + ".png"), chart, super.width, super.height);
    }
}
