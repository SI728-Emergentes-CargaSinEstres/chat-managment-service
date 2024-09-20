package com.upc.cargasinestres.chat_management_service;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class ChatManagementServiceApplication {

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
						.allowedOrigins("http://localhost:4200","https://cse-fundamentos.web.app", "http://localhost:8080") //aquí va el link de tu frontend desplegado
						.allowedMethods("GET", "POST", "PUT", "DELETE", "PATCH") // Permitir los métodos necesarios
						.allowedHeaders("*"); // Permitir todos los encabezados
			}
		};
	}

	/**
	 * Configures and initializes the ModelMapper bean.
	 *
	 * @return A ModelMapper bean for mapping objects.
	 */
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

	/**
	 * The main method that starts the Carga Sin Estres application.
	 *
	 * @param args Command line arguments.
	 */
	public static void main(String[] args) {
		SpringApplication.run(ChatManagementServiceApplication.class, args);
	}

}
