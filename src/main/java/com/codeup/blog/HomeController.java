package com.codeup.blog;
import org.springframework.ui.Model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Random;

@Controller
public class HomeController {
//Remove @ResponseBody for HTML
//    we need @ResponseBody if we are returning plain old texts, or return JSON in a string
//    @GetMapping("/")
//    public @ResponseBody String landingPage(){
//        return "This is the landing page";
//    }

    @GetMapping("/")
    public String showHomePage(){
        return "home";
    }

    @GetMapping("/portfolio")
    public String portfolio(){
        return "portfolio";
    }

    @GetMapping("/roll-dice")
    public String rollDice(){
        return "roll-dice";
    }

    @GetMapping("/roll-dice/{guess}")
    public String rollGuess(@PathVariable int guess, Model model){
        model.addAttribute("guess", guess);
        Random num = new Random();
        int n = num.nextInt(6)+1;
        model.addAttribute("n", String.valueOf(n));
        return ("roll-dice");
    }
}
