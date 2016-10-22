package controllers;

import domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import repositories.UserCrudRepository;

import javax.sql.DataSource;

/**
 * Created by DAMIEN6 on 22/10/2016.
 */
@Controller
public class UserController {

    @Autowired
    UserCrudRepository userCrudRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String doGet(Model model) {
        User user = userCrudRepository.findOne(1L);
        model.addAttribute("name", user.getIdNo());
        return ("WEB-INF/jsp/index.jsp");
    }

}
