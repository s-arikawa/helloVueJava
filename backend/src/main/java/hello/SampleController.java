package hello;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@CrossOrigin
    @GetMapping("/hello")
    String hello() {
        return "Hello World!";
    }
}