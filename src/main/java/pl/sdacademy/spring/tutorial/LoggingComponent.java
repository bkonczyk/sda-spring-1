package pl.sdacademy.spring.tutorial;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class LoggingComponent implements CommandLineRunner {

    @Override
    public void run(String... args) {
        log.info("Hello");
    }
}
