package vdm.mvc;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@EnableAutoConfiguration
@ComponentScan("vdm")
@PropertySource(value = "classpath:/myprop.properties")
public class MvcConfig  {
    MvcConfig() {
        System.out.println("create MvcConfig - configuration");
    }

}
