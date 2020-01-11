package kata3;

public class Kata3 {

    public static void main(String[] args) {
        
        Histogram <String> histogram = new Histogram();
        
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("hotmail.com");
        histogram.increment("ulpgc.com");
        histogram.increment("ulpgc.com");
        histogram.increment("ulpgc.com");
        histogram.increment("ull.com");
        histogram.increment("ull.com");
        
        new HistogramDisplay(histogram).execute();    
    }
    
}
