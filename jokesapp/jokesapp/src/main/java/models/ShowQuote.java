package models;

import Services.PrintQuote;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;

public class ShowQuote implements PrintQuote {

    //This instance is created inside this static context so it can access methods inside ChuckNorrisQuotes non-static Class.
    ChuckNorrisQuotes quote = new ChuckNorrisQuotes();

    @Override
    public String generateQuote() {

        String quoteToString = quote.getRandomQuote();

        return quoteToString;
    }

    public ChuckNorrisQuotes getQuote() {
        return quote;
    }

    public void setQuote(ChuckNorrisQuotes quote) {
        this.quote = quote;
    }
}
