package li.jesse.javadevintegration;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

@MapperScan(value = {"li.jesse.javadevintegration.dao"})
@SpringBootApplication
public class JavaDevIntegrationApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaDevIntegrationApplication.class, args);
    }
}
