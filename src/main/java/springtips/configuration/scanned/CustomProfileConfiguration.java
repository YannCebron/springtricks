package springtips.configuration.scanned;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class CustomProfileConfiguration {

    @Profile("customProfile")
    @Bean(name = "customProfileLongBean")
    public Long profile1Long() {
        return 1L;
    }

}
