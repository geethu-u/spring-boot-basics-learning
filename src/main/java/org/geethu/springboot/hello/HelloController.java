package org.geethu.springboot.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String sayHi(){
        String advOfTomcat = "Why do we have a embedded tommcat-" +
                "1.Convenience- no sep installation" +
                "2.Servlet container config is now application config - Tomcat config can be" +
                "3.Configure using application config" +
                "4.Standalone application - Easy to deploy, dev" +
                "5. Useful for microservice - easy to start up because " +
                "it can be run using some commands" +
                "";
        return advOfTomcat;
    }


}
