package au.com.onik.controllers;

import au.com.onik.domain.User;
import au.com.onik.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;
import java.util.List;

@Controller
public class UserController {

    @Inject
    private UserService userService;

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET,
                    value = "list",
                    produces = "application/json")
    public List<User> listUsers() {
        return userService.listAll();
    }
}

