package cn.it.demo.Contorller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
@RequestMapping("/user")
public class Controller {
    @RequestMapping("/hello")
   @ResponseBody
    public String hh(String name){
        String s=name;
        return s;
    }
    @RequestMapping("/tz")
    public String tz(){
        return "h";
    }

}
