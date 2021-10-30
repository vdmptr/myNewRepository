package vdm.mvc.controller;

//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;

//@RestController
public class GlobalController {

    GlobalController() {
        System.out.println("start my globalController");
    }
    //@GetMapping("/")
    public String hello() {
        return "<h1> Hello <h1>";
    }
}
