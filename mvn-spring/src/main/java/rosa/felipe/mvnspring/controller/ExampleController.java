package rosa.felipe.mvnspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ExampleController {

    @GetMapping("/example")
    public Map<String, String> getExample() {
        return Map.of("key", "value");
    }

}
