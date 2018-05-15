package com.testmaven.testmaven;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

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

    @RequestMapping(value = "/ajaxquery", method = RequestMethod.GET)
    public @ResponseBody
    String getGreeting(@RequestParam String name) {
        String result = "Hello! " + name + ". Time for now is " + new Date().toString();
        bobo mybobo = new bobo("time",result);

        ObjectMapper mapper =new ObjectMapper();
        String jsonInString = null;
        try {
            jsonInString = mapper.writeValueAsString(mybobo);
        } catch (JsonProcessingException exc) {
            exc.printStackTrace();
        }

        return jsonInString;
    }


    public static void main(String[] args) {
        SpringApplication.run(TestmavenApplication.class, args);
    }
}
