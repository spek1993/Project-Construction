package johnny.tutorial.restfulspringboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import johnny.tutorial.restfulspringboot.domain.Product;
import johnny.tutorial.restfulspringboot.property.FileStorageProperties;
import johnny.tutorial.restfulspringboot.property.ApiUrlProperties;
import johnny.tutorial.restfulspringboot.repository.ProductRepository;

@SpringBootApplication
@EnableConfigurationProperties({
    FileStorageProperties.class,
    ApiUrlProperties.class
})
public class RestApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestApplication.class, args);
    }
    
    @Bean
    CommandLineRunner runner(ProductRepository productRepository) {
        return args -> {
            
            Product product1 = new Product("Xbox 360");
            product1.setPrice(299.00);
            product1.setImage("/images/xbox360.jpg");
            productRepository.save(product1);
            
            Product product2 = new Product("Wii");
            product2.setPrice(269.00);
            product2.setImage("/images/wii.jpg");
            productRepository.save(product2);
            
            Product product3 = new Product("Wireless Controller");
            product3.setPrice(19.99);
            product3.setImage("/images/controller.jpg");
            productRepository.save(product3);
            
        };
    }
}
