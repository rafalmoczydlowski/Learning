package config;

import com.example.demo.DefenderFootballer;
import com.example.demo.Footballer;
import com.example.demo.MatchCounter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableAspectJAutoProxy
public class MatchCounterConfig {

    @Bean
    public Footballer footballer() {
        DefenderFootballer df = new DefenderFootballer();
        df.setName("Leo");
        df.setSurname("Messi");
        df.introduceThePlayer();
        List<String> opponents = new ArrayList<>();
        opponents.add("Real Madryt");
        opponents.add("FC Liverpool");
        opponents.add("Legia Warszawa");
        opponents.add("Szombierki Bytom");
        opponents.add("Atletico Madryt");
        df.setMatches(opponents);
        return df;
    }

    @Bean
    public MatchCounter matchCounter() {
        return new MatchCounter();
    }
}
