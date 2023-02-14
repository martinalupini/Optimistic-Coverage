package org.example;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class QuoteOfTheDay {

    File fd;

    public void writeQuoteOfTheDay(String quote) throws IOException {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH_mm_ss");
        LocalDateTime now = LocalDateTime.now();
        fd = new File("src/logic/resources/quotes/file"+dtf.format(now));

        fd.createNewFile();
        BufferedWriter bw = new BufferedWriter(new FileWriter(fd));
        bw.write(quote);
        bw.close();
    }

    public File getFd() {
        return fd;
    }
}
