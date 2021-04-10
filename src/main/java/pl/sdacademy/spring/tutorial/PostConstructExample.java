package pl.sdacademy.spring.tutorial;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Slf4j
public class PostConstructExample {

    @PostConstruct
    public void logMessage() {
        log.info("message from Post Construct");
    }
}
