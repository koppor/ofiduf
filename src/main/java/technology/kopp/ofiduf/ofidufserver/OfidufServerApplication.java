package technology.kopp.ofiduf.ofidufserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OfidufServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OfidufServerApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "Welt") String name) {
		return String.format("Hallo %s!", name);
	}

}
