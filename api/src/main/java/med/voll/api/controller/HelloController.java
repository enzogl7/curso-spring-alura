package med.voll.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/home")
public class HelloController {

    @GetMapping("/homepage")
    public String homePage() {
        System.out.println("home page chamada");
        return "home/home";
    }

}
