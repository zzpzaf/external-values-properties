package com.zzpzaf.se.devxperiences.posts.externalvalues.Properties;

import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.zzpzaf.se.devxperiences.posts.externalvalues.Validators.TableNamesPropertiesValidator;

//import com.zzpzaf.se.devxperiences.posts.externalvalues.Utils.MyProperties;

@Configuration
@PropertySource(value="classpath:db-objects.props", ignoreResourceNotFound=true)
// @PropertySource("classpath:db-objects-mariadb.properties")
// @EnableConfigurationProperties(DataBaseObjectNames.class)
@ConfigurationPropertiesScan()
public class PropConfig {
    
    @Bean
    public static TableNamesPropertiesValidator configurationPropertiesValidator() {
        return new TableNamesPropertiesValidator();
    }


}
