package com.zzpzaf.se.devxperiences.posts.externalvalues;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Value;
// import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
// import org.springframework.context.ConfigurableApplicationContext;
// import org.springframework.context.annotation.AnnotationConfigApplicationContext;
// import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;




// import org.springframework.context.annotation.Bean;
// import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
// import org.springframework.core.io.Resource;
// import org.springframework.core.io.ClassPathResource;


// import jakarta.annotation.PostConstruct;


@SpringBootApplication
//@PropertySource("classpath:db-objects.props") 
//@ConfigurationPropertiesScan()
public class externalValuesApplication {
	    
    public static void main(String[] args) {
        
        ApplicationContext appcxt = SpringApplication.run(externalValuesApplication.class, args);

    }


}




