package springtips.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("ALL")
@Configuration
public class GenericsAutowiringConfiguration {

    private final List<Integer> integers;
    private final List<Double> doubles;

    @Autowired
    public GenericsAutowiringConfiguration(List<Integer> myIntegerList,
                                           List<Double> myDoubleList) {
        this.integers = myIntegerList;
        this.doubles = myDoubleList;
    }

    @Bean
    List<Integer> integerList() {
        return new ArrayList<>();
    }

    @Bean
    List<Double> doubleList() {
        return new ArrayList<>();
    }

}
