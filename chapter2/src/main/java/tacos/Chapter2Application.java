package tacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Chapter2Application {
/*    public class Chapter2Application implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("home");
    }*/
    public static void main(String[] args) {
        SpringApplication.run(Chapter2Application.class, args);
    }


}
