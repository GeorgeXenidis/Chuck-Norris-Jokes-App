package Controllers;

import Services.PrintQuote;
import models.ShowQuote;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    PrintQuote printQuoteInjection = new ShowQuote();

    @RequestMapping("/")
    public String showRandomQuote(Model quotesModel)
    {
        quotesModel.addAttribute("quote", printQuoteInjection.generateQuote());

        return "index";
    }

}
