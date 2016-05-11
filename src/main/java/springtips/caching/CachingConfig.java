package springtips.caching;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("springtips.caching.*")
@EnableCaching
public class CachingConfig {
}
