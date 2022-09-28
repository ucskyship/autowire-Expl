package config;

import beans.Car;
import beans.Driver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Driver driver(Car car){
        return new Driver();
    }

    @Bean
    public Car car(){
        return new Car();
    }
}
