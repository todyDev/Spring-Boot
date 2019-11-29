package tody.springboot.springbootproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * HomeController
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String indexPage() {
        return "index";
    }
}