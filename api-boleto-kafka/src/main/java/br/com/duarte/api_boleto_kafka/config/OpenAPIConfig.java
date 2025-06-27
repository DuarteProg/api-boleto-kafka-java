package br.com.duarte.api_boleto_kafka.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI().info(new Info()
                .title("Api Boleto")
                .description("API de pagamento de boletos")
                .contact(new Contact().name("Lucas DUarte ").email("lucas.duartebabosa@outlook.com"))
                .version("1.0.0")
        );
    }
}
