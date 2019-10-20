package li.jesse.javadevintegration.controller;

import li.jesse.javadevintegration.function.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RabbitMqController {

    @Autowired
    private Sender sender;

    @GetMapping("/hello")
    public String helloTest() throws Exception {
        sender.send();
        return "success";
    }
}
