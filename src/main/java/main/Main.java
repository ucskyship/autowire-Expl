package main;

import beans.Car;
import beans.Driver;
import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(AppConfig.class)){
            Driver driver = context.getBean(Driver.class);
            Car car = context.getBean(Car.class);

            System.out.println(driver);
            System.out.println(car);
        }
    }
}
