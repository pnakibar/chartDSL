package gen;

import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;

import java.io.File;
import java.io.IOException;

/**
 * Created by pedronakibar on 13/03/15.
 */
public class SaveJPEG extends Save {
    public SaveJPEG(String width, String height) {
        super(width, height);
    }

    @Override
    public String getFormat() {
        return "jpeg";
    }

    public SaveJPEG(Integer width, Integer height) {
        super(width, height);
    }
    @Override
    public void save(String location, JFreeChart chart)  {
        try {
            ChartUtilities.saveChartAsJPEG(new File(location + ".jpeg"), chart, super.width, super.height);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

