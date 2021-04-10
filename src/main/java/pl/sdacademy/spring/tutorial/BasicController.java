package pl.sdacademy.spring.tutorial;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @GetMapping
    public ResponseEntity<Ping> hello() {
        Ping ping = new Ping("Bartek", 25);
        return ResponseEntity.status(HttpStatus.OK).body(ping);
    }
}

@AllArgsConstructor
@NoArgsConstructor
@Data
class Ping {
    private String name;
    private Integer age;
}
