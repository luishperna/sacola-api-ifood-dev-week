package me.dio.sacola.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {
    @Bean
    public Docket getBean() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .paths(PathSelectors.regex("/api/.*"))
                .build()
                .apiInfo(getInfo());
    }
    private ApiInfo getInfo() {
        return new ApiInfoBuilder()
                .title("SacolaAPI")
                .description("Sacola API com o objetivo de servir uma aplicação de Delivery.")
                .version("1.0.0")
                .build();
    }
}
