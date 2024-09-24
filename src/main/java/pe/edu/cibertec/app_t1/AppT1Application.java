package pe.edu.cibertec.app_t1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class AppT1Application {

	public static void main(String[] args) {
		SpringApplication.run(AppT1Application.class, args);
	}
}
	