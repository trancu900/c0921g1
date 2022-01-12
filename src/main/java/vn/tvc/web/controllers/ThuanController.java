package vn.tvc.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import vn.tvc.web.dependency.injection.Store;
import vn.tvc.web.services.IUserService;
import vn.tvc.web.services.UserServiceImpl;


@Controller
public class ThuanController {
    @Autowired
    IUserService userService;
    @Autowired
    Store store;

    @GetMapping("/thuan")
    public String esfadsfsadf(String action, Model model) {
        //@RequestParam
//        if(action==null)
//            throw new IllegalArgumentException("required action");
        System.out.println(action);
        if (userService != null)
            System.out.println("Inject");
        System.out.println(store);
        model.addAttribute("action", action);
        return "index";
    }

}
