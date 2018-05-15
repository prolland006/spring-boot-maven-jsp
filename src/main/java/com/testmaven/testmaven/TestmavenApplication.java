package com.testmaven.testmaven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@SpringBootApplication
public class TestmavenApplication {

    @RequestMapping(value="/sayHello", method = RequestMethod.GET)
    public String sayHello() {
        return "hello world";
    }


    @RequestMapping("/ajax")
    public ModelAndView helloAjaxTest() {
        return new ModelAndView("ajax", "message", "Crunchify Spring MVC with Ajax and JQuery Demo..");
    }


    public static void main(String[] args) {
        SpringApplication.run(TestmavenApplication.class, args);
    }
}
