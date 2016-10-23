package controllers;

import domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import repositories.UserCrudRepository;
import services.UserService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by DAMIEN6 on 22/10/2016.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/allUsers", method = RequestMethod.GET)
    public String exampleRequestMapping(Model model) {
        List<User> users = userService.findAll();
        model.addAttribute("users", users);
        return ("users");
    }

//    To Access this page, you need to use the following url
//    http://{serverIp}:{port}/user?id=1
    @RequestMapping(value = "/userId", method = RequestMethod.GET)
    public String exampleRequestParam(@RequestParam("id") Long id, Model model) {
        User user = userService.findOne(id);
        model.addAttribute("user", user);
        return ("singleUser");
    }

//    TO access this page, you need to use the following url
//    http://{serverIp}:{port}/userName/{username}
    @RequestMapping(value = "/name/{name}")
    public String exampleRequestVariable(@PathVariable("name") String name, Model model) {
        User user = userService.findByName(name);
        model.addAttribute("user", user);
        return ("singleUser");
    }

//    You can get details about the actual http request
    @RequestMapping(value = "/usersBySurname")
    public String exampleHttpServletRequest(HttpServletRequest httpServletRequest) {
        //do something
        return "";
    }

//    Multiple path variables example
    @RequestMapping(value = "/userName/{name}/userSurname/{surname}")
    public ModelAndView exampleMultiplePathVariable(@PathVariable String name, @PathVariable String surname, Model model) {
//        Do not need to declare path variables explicitly e.g. @PathVariable("name") if name
//        of the path variable and parameter have the same name
        User user = userService.findByNameAndSurname(name, surname);
        model.addAttribute("user", user);
        return new ModelAndView("singleUser", model.asMap());
    }

    @RequestMapping("/deleteAll")
    public String exampleDeleteAll() {
        userService.deleteAll();
        return "users";
    }


}
