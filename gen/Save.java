package gen;

import org.jfree.chart.JFreeChart;

import java.io.File;
import java.io.IOException;

/**
 * Created by pedronakibar on 13/03/15.
 */
public abstract class Save {
    protected Integer width;
    protected Integer height;

    public Save(Integer width, Integer height){
        this.width = width;
        this.height = height;
    }

    public Save(String width, String height){
        this.width = new Integer(width);
        this.height = new Integer(height);
    }

    public abstract void save(String location, JFreeChart chart) throws IOException;

    public Integer getWidth() {
        return width;
    }

    public Integer getHeight() {
        return height;
    }
}
