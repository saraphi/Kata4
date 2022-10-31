package kata4;

import files.*;
import model.*;
import java.io.File;
import java.util.List;

public class Kata4 {

    public static void main(String[] args) {
        Loader emailLoader = new EmailLoader(new FileLoader(new File("emails.txt")));
        List<String> emails = emailLoader.load();
        Histogram<String> histogram = new Histogram();
        for (String email : emails) histogram.increment(email.substring(email.indexOf("@") + 1));
        new HistogramDisplay(histogram).execute();
    }
}
