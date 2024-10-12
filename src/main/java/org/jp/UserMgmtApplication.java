package org.jp;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
<<<<<<< HEAD
=======
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
>>>>>>> branch 'danish' of https://github.com/erdanishrajput/User-Managament.git

@SpringBootApplication
@EnableJpaRepositories(basePackages = "org.jp.repository")
public class UserMgmtApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserMgmtApplication.class, args);
        System.out.println("started....");
    }
	
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
	
	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}

}
