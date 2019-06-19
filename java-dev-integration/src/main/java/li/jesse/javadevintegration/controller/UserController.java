package li.jesse.javadevintegration.controller;

import li.jesse.javadevintegration.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user/")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "get_information", method = RequestMethod.GET)
    @ResponseBody
    public void getUserInfo() {
        Long id = 6171920391208960L;
        userService.getInformation(id);
    }
}
