package server;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
    @Controller
    public class App {
        @GetMapping("/hello")
        public String getHello() {
                return "Hello World";

        };
}