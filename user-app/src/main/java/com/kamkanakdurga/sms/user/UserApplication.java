package com.kamkanakdurga.sms.user;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.kamkanakdurga.sms.user.service.UserService;

@SpringBootApplication
public class UserApplication {
	
	 @Autowired
	  UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
    
    @Bean
    public ModelMapper modelMapper() {
      return new ModelMapper();
    }

    //  implements CommandLineRunner
//    @Override
//    public void run(String... params) throws Exception {
//      User admin = new User();
//      admin.setUsername("admin");
//      admin.setPassword("admin");
//      admin.setEmail("admin@email.com");
//      admin.setRoles(new ArrayList<Role>(Arrays.asList(Role.ROLE_ADMIN)));
//
//      userService.signup(admin);
//
//      User client = new User();
//      client.setUsername("client");
//      client.setPassword("client");
//      client.setEmail("client@email.com");
//      client.setRoles(new ArrayList<Role>(Arrays.asList(Role.ROLE_CLIENT)));
//
//      userService.signup(client);
//    }
    
}
