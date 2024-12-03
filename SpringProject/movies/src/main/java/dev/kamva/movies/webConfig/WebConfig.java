//package dev.kamva.movies.webConfig;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//public class WebConfig implements WebMvcConfigurer {
//
//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/api/v1/**") // Adjust to your API paths
//                .allowedOrigins("http://localhost:3000") // Allow specific origin
//                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Allowed methods
//                .allowedHeaders("*") // Allow all headers
//                .allowCredentials(true); // Allow credentials if needed
//    }
//}