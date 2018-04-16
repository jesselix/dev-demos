package li.jesse.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class HelloController {

    private static Logger logger = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping(method = RequestMethod.GET)
    public String printHello(ModelMap model) {
        logger.info("ssssss");
        model.addAttribute("message", "Hello Spring MVC Framework!");
        return "hello";
    }
}
