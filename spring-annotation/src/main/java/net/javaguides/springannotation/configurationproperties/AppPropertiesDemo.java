package net.javaguides.springannotation.configurationproperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AppPropertiesDemo {

    //lesson 8 in order to inject we have to apply @AutoWired
    @Autowired
    private AppProperties appProperties;

    public void display() {
        System.out.println(appProperties.getName());
        System.out.println(appProperties.getDescription());
        System.out.println(appProperties.getuploadDir());
        //add security print calls in AppProperitiesDemo
        System.out.println(appProperties.getSecurity().getUsername());
        System.out.println(appProperties.getSecurity().getPassword());
        System.out.println(appProperties.getSecurity().roles);
        System.out.println(appProperties.getSecurity().isEnabled());
        System.out.println(appProperties.getSecurity().getPermissions());
    }
}