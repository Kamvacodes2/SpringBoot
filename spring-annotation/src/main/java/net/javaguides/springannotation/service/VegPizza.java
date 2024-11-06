package net.javaguides.springannotation.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//Lesson 5
//@Component
//@Primary
public class VegPizza implements Pizza {

    @Override
    public String getPizza(){
        return "Veg Pizza!";
    }
}


 // implements included for Qualifier Annotation lesson 3
//@Component
////@Primary // this now has higher preference when injected into Dependency lesson 4
//public class VegPizza implements Pizza {
//    //Annotate with @Override (lesson 3)
//     @Override
//    public String getPizza(){
//        return "Veg Pizza";
//    }
//}
