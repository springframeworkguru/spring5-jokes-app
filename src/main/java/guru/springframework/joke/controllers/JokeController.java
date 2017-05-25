package guru.springframework.joke.controllers;

import guru.springframework.joke.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jt on 5/25/17.
 */
@Controller
public class JokeController {

    private JokeService jokeService;

    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model){

        model.addAttribute("joke", jokeService.getJoke());

        return "chucknorris";
    }
}
