package com.backend.server; // Package declaration for the "server" package under "com.backend"

import org.springframework.boot.SpringApplication; // Import Spring Boot class for SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication; // Import Spring Boot annotation for auto-configuration

/**
 * @class ServerApplication
 * @brief This Main class that serves as the entry point for the Spring Boot application.
 *
 * @SpringBootApplication Indicates that this class is a Spring Boot application and enables auto-configuration.
 */

@SpringBootApplication
public class ServerApplication {

     	/**
 	 * @brief The main method, which is the starting point of the application.
         *
         * Run the Spring Boot application with this class (ServerApplication) as the primary configuration source 
	 * and the provided command-line arguments (args).
         * <p>
         * The SpringApplication.run method starts the Spring Boot application and launches the embedded web server,
	 * making the application ready to receive incoming requests.
         * 
         * See [Issue6] (https://github.com/WSUCEG-7140/mystore-teamDelta/issues/6)
	 */
     
	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

}
