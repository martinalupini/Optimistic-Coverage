import org.example.QuoteOfTheDay;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class TestQuoteOfTheDay {

    @Test
    public void testWriteQuoteOfTheDay(){
        String quote = "never a failure always a lesson";
        QuoteOfTheDay quoteOfTheDay = new QuoteOfTheDay();
        try {
            quoteOfTheDay.writeQuoteOfTheDay(quote);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String actual_quote = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(quoteOfTheDay.getFd()));
            actual_quote = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        assertEquals(quote, actual_quote);

    }

}
