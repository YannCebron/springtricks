package springtips.caching;

import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class CustomCacheManager implements CacheManager {

    @Override
    public Cache getCache(String name) {
        return null;
    }

    @Override
    public Collection<String> getCacheNames() {
        return null;
    }
}
