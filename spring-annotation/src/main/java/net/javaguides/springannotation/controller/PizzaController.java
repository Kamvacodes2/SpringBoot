package net.javaguides.springannotation.controller;

import net.javaguides.springannotation.service.Pizza;
import net.javaguides.springannotation.service.VegPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PizzaController {

    //Lesson 4 Primary Annotation
    private Pizza pizza;
    //Lesson2

//
//    @Autowired
    public PizzaController(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getPizza(){
        return pizza.getPizza();
    }


    // LESSON 3 inject interface to achieve loose coupling
    // pizza variable has multiple implementations between Veg and Non-Veg
    // which will be chosen?
    // there we use @Qualifier notation
//    private Pizza pizza;
    // field injection lesson 2
//    @Autowired
//    public PizzaController(@Qualifier("nonVegPizza") Pizza pizza) {
//        this.pizza = pizza;
//    }
//    private VegPizza vegPizza; // lESSON 2

    //constructor injection
//    @Autowired
//    public PizzaController(VegPizza vegPizza) {
//        this.vegPizza = vegPizza;
//    }

    // setter injection
//    @Autowired
//    public void setVegPizza(VegPizza vegPizza){
//        this.vegPizza = vegPizza;
//    }


    // lesson 3
//    public String getPizza(){
//        return pizza.getPizza();
//    }

    // lesson 2
//    public String getPizza(){
//        return vegPizza.getPizza();
//    }

//    lesson 5
    public void init(){
        System.out.println("Initialization logic");
    }

    public void destroy(){
        System.out.println("Destruction logic");
    }

}
