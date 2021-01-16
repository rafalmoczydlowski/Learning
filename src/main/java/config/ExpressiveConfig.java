package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:/defender.properties")
@ComponentScan("com.example.demo")
public class ExpressiveConfig {
}
