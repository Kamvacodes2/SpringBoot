package net.javaguides.springannotation.config;

import net.javaguides.springannotation.controller.PizzaController;
import net.javaguides.springannotation.service.NonVegPizza;
import net.javaguides.springannotation.service.Pizza;
import net.javaguides.springannotation.service.VegPizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//lesson 5
@Configuration
public class AppConfig {
    //tell spring IOC container to manage Pizza object
    //Lesson 5 we can also name our bean and pass this in the main function
    @Bean(name = "vegPizzaBean")
    public Pizza vegPizza(){
        // using new keyword to create object of Veg Pizza
        return new VegPizza();
    }

    //Lesson5 injecting the dependency
    @Bean
     public Pizza nonVegPizza(){
        return new NonVegPizza();
     }

     //lesson 5
    //injecting VegPizza into PizzaController
//     using init Method and destroyMethod
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public PizzaController pizzaController(){
        return new PizzaController(vegPizza());
    }
}
