package petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FrontController {


    @RequestMapping({"/", "", "index", "index.html"})
    public String index(Model model) {
        return "index";
    }
}
