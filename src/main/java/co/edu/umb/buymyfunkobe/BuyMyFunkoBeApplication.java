package co.edu.umb.buymyfunkobe;

import co.edu.umb.buymyfunkobe.model.entity.Address;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class BuyMyFunkoBeApplication {

  public static void main(String[] args) {
    SpringApplication.run(BuyMyFunkoBeApplication.class, args);
  }

  @Bean
  protected PasswordEncoder passwordEncoder(){
    return new BCryptPasswordEncoder();
  }

  @Bean
  protected WebMvcConfigurer corsConfigurer() {
    return new WebMvcConfigurer() {
      @Override
      public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
          .allowedOrigins("*")
          .allowedHeaders("*")
          .allowedMethods("*")
          .exposedHeaders("*")
          .allowedOriginPatterns("*");
      }
    };
  }
}
