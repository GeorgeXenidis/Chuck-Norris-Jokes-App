package me.springboot.jokesapp.Controllers;

import me.springboot.jokesapp.models.ShowQuoteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    ShowQuoteService quoteService;

    public JokeController(ShowQuoteService quoteService) {
        this.quoteService = quoteService;
    }

    @RequestMapping("/")
    public String showRandomQuote(Model quotesModel)
    {
        quotesModel.addAttribute("quote", quoteService.generateQuote());

        return "mainPage";
    }

}
