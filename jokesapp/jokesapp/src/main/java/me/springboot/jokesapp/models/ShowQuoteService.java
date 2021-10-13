package me.springboot.jokesapp.models;

import me.springboot.jokesapp.Services.PrintQuote;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class ShowQuoteService implements PrintQuote {

    //This instance is created inside this static context so it can
    // access methods inside ChuckNorrisQuotes non-static Class.
    ChuckNorrisQuotes getCheckNorisObject;
    private ShowQuoteService() {
        this.getCheckNorisObject = new ChuckNorrisQuotes();
    }

    @Override
    public String generateQuote() {

        String quote = getCheckNorisObject.getRandomQuote();

        return quote;
    }
}
