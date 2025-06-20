package ba.sum.fpmoz.javaapp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // Staticke slike unutar JAR-a iz foldera src/main/resources/static
        registry.addResourceHandler("/static/**")
                .addResourceLocations("classpath:/static/");

        // Uploadane slike izvan JAR-a (u Dockeru /app/images)
        registry.addResourceHandler("/images/**")
                .addResourceLocations("file:/app/images/");
    }
}
