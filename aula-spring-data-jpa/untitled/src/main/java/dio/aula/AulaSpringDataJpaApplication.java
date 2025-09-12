package dio.aula;

import dio.aula.model.User;
import dio.aula.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AulaSpringDataJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(AulaSpringDataJpaApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(UserRepository repository) {
        return args -> {

            User user = new User();
            user.setName("Richard");
            user.setUsername("Richard");
            user.setPassword("Rin123");

            repository.save(user);

            System.out.println("Usuário salvo com sucesso!");

            for (User u : repository.findAll()) {
                System.out.println(u.getName());
            }
        };
    }
}