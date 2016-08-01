package springtips.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SuppressWarnings("ALL")
@Configuration
public class GenericsAutowiringConfiguration {

    private final Repository<Employee> employeeRepository;
    private final Repository<Department> departmentRepository;

    public GenericsAutowiringConfiguration(Repository<Employee> employeeRepository,
                                           Repository<Department> departmentRepository) {
        this.employeeRepository = employeeRepository;
        this.departmentRepository = departmentRepository;
    }

    @Bean
    Repository<Employee> employeeRepository() {
        return new Repository<Employee>() {
        };
    }

    @Bean
    Repository<Department> departmentRepositoryRepository() {
        return new Repository<Department>() {
        };
    }


    public interface Repository<T> {
    }


    private static class Employee {
    }

    private static class Department {
    }
}
