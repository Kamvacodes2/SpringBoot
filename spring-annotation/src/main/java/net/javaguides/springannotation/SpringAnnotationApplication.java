package net.javaguides.springannotation;

import net.javaguides.springannotation.configurationproperties.AppPropertiesDemo;
import net.javaguides.springannotation.controller.MyController;
import net.javaguides.springannotation.controller.PizzaController;
import net.javaguides.springannotation.lazy.LazyLoader;
import net.javaguides.springannotation.repository.MyRepository;
import net.javaguides.springannotation.service.MyService;
import net.javaguides.springannotation.service.VegPizza;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAnnotationApplication {

	public static void main(String[] args) {

		var context = SpringApplication.run(SpringAnnotationApplication.class, args);
		//Lesson 6 commented out
//		PizzaController pizzaController = context.getBean(PizzaController.class);
//		System.out.println(pizzaController.getPizza());
		MyController myController = context.getBean(MyController.class);
		System.out.println(myController.hello());

		//Lesson 6 bring in the service annotation
		MyService myService = context.getBean(MyService.class);
		System.out.println(myService.hello());

		//Lesson 6 bring in the repository annotation
		MyRepository myRepository = context.getBean(MyRepository.class);
		System.out.println(myRepository.hello());

		// Lesson 7 LAZY ANNOTATION IMPLEMENTATION
		LazyLoader lazLoader = context.getBean(LazyLoader.class);

		//Lesson 8
//		AppPropertiesDemo appPropertiesDemo = context.getBean(AppPropertiesDemo.class);
//		appPropertiesDemo.display();

		//Lesson 5 commented out
//		PizzaController pizzaController = context.getBean(PizzaController.class);
//		System.out.println(pizzaController.getPizza());

		// lesson 5 to create VegPizza SpringBean
		// lesson 5 passing in the name of the bean
	VegPizza vegPizza =	(VegPizza) context.getBean("vegPizzaBean");
	System.out.println(vegPizza.getPizza());
	}

}
