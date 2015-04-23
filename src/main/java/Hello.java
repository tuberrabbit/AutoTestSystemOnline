import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Hello {

    @RequestMapping("/")
    private String sayHello() {
        return "Hello, World!";
    }

    public static void main(String[] asdf) {
        SpringApplication.run(Hello.class, asdf);
    }
}
