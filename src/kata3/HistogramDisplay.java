package kata3;

import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class HistogramDisplay extends ApplicationFrame {

    private final Histogram <String> histogram;
    
    public HistogramDisplay(Histogram <String> histogram) {
        super("Histograma");
        this.histogram = histogram;
        this.setContentPane(createPanel());
        this.pack(); // Ajusta el tamaño de la ventana. 
    }
    
    public void execute () {
        setVisible(true);
    }
   
    private JPanel createPanel() {
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(500, 400));
        return chartPanel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataSet){
        JFreeChart chart = ChartFactory.createBarChart(
                "Histograma JFreeChart",    // Título
                "Dominios email",           // Etiqueta eje horizontal
                "Nº de emails",             // Etiqueta eje vertical
                dataSet,
                PlotOrientation.VERTICAL,      
                false,                      // Show legeng
                false,                      // Use tooltips
                rootPaneCheckingEnabled     // Configure chart to generate URLs?
        );
        return chart;
    }
    
    private DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        
        /*dataSet.addValue(300, "", "ulpgc.es");
        dataSet.addValue(200, "", "dis.ulpgc.es");
        dataSet.addValue(800, "", "gmail.com");*/
        
        for (String key : histogram.keySet()) {
            dataSet.addValue(histogram.get(key), "", key);
        }
        
        return dataSet;
    }
}
