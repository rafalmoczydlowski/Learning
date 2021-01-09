package config;

/*/
import com.example.demo.DefenderFootballer;
import com.example.demo.DefenderFootballerStats;
import com.example.demo.Footballer;
import org.springframework.context.annotation.Bean;
/*/
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.demo")
public class FootballerConfig {

    /*/ to byłoby potrzebne gdybym nie korzystał z adnotacji ComponentScan
    @Bean
    public Footballer defenderFootballer() {
        return new DefenderFootballer();
    }

    @Bean
    //wstrzykiwanie przez settera
    public DefenderFootballerStats defenderFootballerStats(Footballer footballer) {
        DefenderFootballerStats defenderFootballerStats = new DefenderFootballerStats(footballer);
        defenderFootballerStats.setFootballer(footballer);
        return defenderFootballerStats;
    }
    /*/
}
