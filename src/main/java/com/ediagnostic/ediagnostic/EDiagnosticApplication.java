package com.ediagnostic.ediagnostic;

import com.ediagnostic.config.SecurityConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({SecurityConfig.class})
@ComponentScan(value = "com.ediagnostic")
public class EDiagnosticApplication {

	public static void main(String[] args) {
		SpringApplication.run(EDiagnosticApplication.class, args);
	}
}
