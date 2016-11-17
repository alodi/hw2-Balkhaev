package ru.sbt.bit.ood.hw1;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by balkh on 03.11.2016.
 */
public class ParserCSV implements Parser {
    public Iterable<Trade> parse(String filename) {
        try {
            Reader in = new FileReader(filename);
            Iterable<Trade> records = FromCSVToTrade(CSVFormat.EXCEL.parse(in));
            return records;
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("There was an error while parsing CSV file");
        }
    }

    private Iterable<Trade> FromCSVToTrade(Iterable<CSVRecord> recordsCSV) {
        // from CSV to Trade
        List<Trade> records = new ArrayList<Trade>();
        for (CSVRecord record : recordsCSV) {
            Trade trade = new Trade(record.toMap());
            records.add(trade);
        }
        return records;
    }

}
