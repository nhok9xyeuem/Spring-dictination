package controllers;

import model.Dictionary;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServlet;
@Controller
public class ControllersDictionary extends HttpServlet {
@GetMapping("/display")
    public String display(){
    return "display";
}
@PostMapping("/translate")
    public String translate (@RequestParam String english, Model model){
    Dictionary dictionary = new Dictionary();
    model.addAttribute("english", english);
    model.addAttribute("vietnamese",dictionary.getVietnamese(english));

    if (dictionary.getVietnamese(english)==null){
        return "notfound";
    }else {
        return "translate";
    }
    }

}