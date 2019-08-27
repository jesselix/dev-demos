package li.jesse.javadevintegration.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/getJson/")
public class HelloWorldController {


    @RequestMapping(value = "get_some", method = RequestMethod.GET)
    @ResponseBody
    public HashMap<String, Object> getSome() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("name", "Jason");
        map.put("Age", 12);

        return map;
    }
}
