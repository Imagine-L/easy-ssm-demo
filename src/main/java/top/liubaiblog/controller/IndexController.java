package top.liubaiblog.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 刘佳俊
 */
@RestController
public class IndexController {

    @GetMapping("/")
    public String index(Model model) {
        return "<h1>Get&nbsp;<a href='http://localhost:8080/ssm/user/1'>User One</a></h1>";
    }
}
