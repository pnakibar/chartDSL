package gen;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

/**
 * Created by pedronakibar on 13/03/15.
 */
public class SaveWindow extends Save {

    public SaveWindow(Integer width, Integer height) {
        super(width, height);
    }
    public SaveWindow(String width, String height) {
        super(width, height);
    }

    @Override
    public String getFormat() {
        return "window";
    }


    @Override
    public void save(String location, JFreeChart chart) {
        ChartWindow window = new ChartWindow(location, chart);
        window.setSize( super.width , super.height );
        RefineryUtilities.centerFrameOnScreen(window);
        window.setVisible( true );

    }

    private class ChartWindow extends ApplicationFrame{
        public ChartWindow(String title, JFreeChart chart) {
            super(title);
            this.setContentPane(new ChartPanel(chart));
        }
    }
}
