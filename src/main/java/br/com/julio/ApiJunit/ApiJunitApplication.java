package br.com.julio.ApiJunit;

import br.com.julio.ApiJunit.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiJunitApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiJunitApplication.class, args);
                
                User user1 =  new User();
                User user2 = new User(1, "Márcio", "marcio@gmail.com", "12345");
	}

}
