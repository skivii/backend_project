package fi.haagahelia.backendproject.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@ResponseBody
public class HelloController {

    @RequestMapping("*")
     public String homepage() {
        return "Welcome to the home page";   
     }
    @RequestMapping("/hello")
    public String hello(@RequestParam(name="name", required=false, defaultValue="World") String name, @RequestParam String location) {
    return "Welcome to the " + location + " " + name + "!";
     }

     @RequestMapping("/index")
     public String index() {
        return "This is the main page";

     }

     @RequestMapping("/contact")
     public String contact() {
        return "This is the contact page";
     }
}



