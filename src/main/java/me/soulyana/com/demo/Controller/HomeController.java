package me.soulyana.com.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String homePage() {
        return "hometemplate";
    }

    @RequestMapping("/sayhello")
    public String sayHello(HttpServletRequest request, Model model) {
        String myName = request.getParameter("yourname");
        System.out.println(myName);
        model.addAttribute("yourname", myName );
        return "hello";
    }
}
