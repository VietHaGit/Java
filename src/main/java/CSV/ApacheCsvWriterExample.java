package CSV;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;

public class ApacheCsvWriterExample {
    public static void main(String[] args)
            throws IOException {
        String csvFile = "src/main/resources/fileTest5.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(csvFile));
             CSVPrinter csvPrinter = new CSVPrinter(writer,
                     CSVFormat.DEFAULT.withHeader("id", "code", "name"));) {
            csvPrinter.printRecord("1", "US", "United States");
            csvPrinter.printRecord("2", "VN", "Viet Nam");
            csvPrinter.printRecord("3", "AU", "Australia");
            csvPrinter.printRecord("4","BU","Nga");
            csvPrinter.flush();
        }
    }
}
