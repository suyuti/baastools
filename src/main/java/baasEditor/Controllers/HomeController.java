package baasEditor.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by mehmet.dindar on 17.02.2015.
 */

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }

}
