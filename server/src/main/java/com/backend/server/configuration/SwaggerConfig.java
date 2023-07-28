// Import required libraries for Spring and Swagger
package com.backend.server.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

// Mark this class as a configuration class for Spring
/**
 * @class SwaggerConfig
 * @brief This class contains the Swagger configuration for the Spring application.
 *
 * The @Configuration annotation marks this class as a configuration class for Spring,
 * which will be used to define Spring Beans.
 */ 
@Configuration
public class SwaggerConfig {

        /**
         * @brief The @Bean annotation is used to define a Spring Bean named api(). 
         * This method creates and configures the Swagger Docket.
         * It Specify the paths for which documentation will be generated
         * <p>
         *
         * @returns a new instance of the Docket, configuring it for Swagger 2
         */
        
        @Bean
        public Docket api() {
            return new Docket(DocumentationType.SWAGGER_2)
                    .select()
                    .apis(RequestHandlerSelectors.any())
                    .paths(PathSelectors.any())
                    .build();
        }
}
