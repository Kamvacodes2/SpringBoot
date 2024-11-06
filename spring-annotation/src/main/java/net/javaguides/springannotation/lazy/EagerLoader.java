package net.javaguides.springannotation.lazy;

import org.springframework.stereotype.Component;

@Component
public class EagerLoader {

    //create a constructor
    public EagerLoader() {
        System.out.println("EagerLoader . .");
    }
}
