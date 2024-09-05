package cn.sz.gl.control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

    @RequestMapping("/sh")
    public String sayhello(){
        return "hello world";
    }


}
