Created using IntelliJ and Spring Initializr plugin for Spring Boot web and Maven. So, basic framework web configuration was generated by default.

with json ajax example

# Working with JSP

## Step 1: Create index.jsp
If you want to work with JSPs, you need to create new directories under main:

- webapp
  - WEB-INF
      - jsp
        - home.jsp

## Step 2: Edit (or create) application.properties
Add this to application.properties (you should create it inside resource directory if it isn't)

```
spring.mvc.view.prefix=/WEB-INF/jsp/
spring.mvc.view.suffix=.jsp
```
## Step 3: Add dependencies in build.gradle
You can copy these lines but **you should use the packages versions that fits you**. Check the links below and search what you want. However you've got to use **providedCompile group** instead of **compile group** 
```
compile('javax.servlet:jstl')
```
## Step 4: Add proper controller
```
@Controller
public class MainController {
    @GetMapping("/")
    public String home(){
        return "home";
    }
}
```