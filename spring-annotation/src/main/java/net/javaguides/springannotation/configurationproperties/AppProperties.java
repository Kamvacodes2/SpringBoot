package net.javaguides.springannotation.configurationproperties;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "app")
@Component
public class AppProperties {

    //Lesson 8 nb ensure that the naming convention is same in .properties file
    private String name;
    private String description;
    private String uploadDir; // this is the same as upload-dir
    private Security security = new Security();

    public static class Security {
        private String username;
        private String password;
        List<String> roles = new ArrayList<>();
        private boolean enabled;
        private Map<String, String> permissions = new HashMap<>();

        public void setUsername(String username){
            this.username = username;
        }

        public void setPassword(String password){
            this.password = password;
        }

        public void setRoles(List<String> roles){
            this.roles = roles;
        }

        public void setEnabled(boolean enabled){
            this.enabled = enabled;
        }

        public boolean isEnabled(){
            return enabled;
        }


        public String getUsername(){
            return username;
        }

        public String getPassword(){
            return password;
        }

        public List<String> getRoles(){
            return roles;
        }

        public void setPermissions(Map<String, String> permissions){
            this.permissions = permissions;
        }

        public Map<String, String> getPermissions(){
            return permissions;
        }

    }


    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUploadDir(String uploadDir) {
        this.uploadDir = uploadDir;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public String getuploadDir(){
        return uploadDir;
    }

    public void setSecurity(Security security) {
        this.security = security;
    }

    public Security getSecurity() {
        return security;
    }
}
