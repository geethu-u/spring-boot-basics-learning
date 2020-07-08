package org.geethu.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApi {
    public static void main(String[] args) {
        //Set up default config
        //Creates application context
        //Scans classpath to identify the annotations
        //runs the tomcat container(springboot is standalone, tomcat comes along with it)
        SpringApplication.run(CourseApi.class, args);
    }
}
