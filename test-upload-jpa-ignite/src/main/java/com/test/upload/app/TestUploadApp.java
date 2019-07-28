package com.test.upload.app;

import org.apache.ignite.Ignite;
import org.apache.ignite.IgniteException;
import org.apache.ignite.Ignition;
import org.apache.ignite.springdata.repository.config.EnableIgniteRepositories;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import config.ClientConfigurationFactory;

@SpringBootApplication
@EnableJpaRepositories("com.test.upload.app.jparepository")
@EnableIgniteRepositories("com.test.upload.app.repository")
public class TestUploadApp extends SpringBootServletInitializer {

	private static Logger log = LoggerFactory.getLogger(TestUploadApp.class);
	
	public static void main(String[] args) {
		log.info("start application...");
		SpringApplication.run(TestUploadApp.class, args);
	}

	@Bean
    public Ignite igniteInstance() throws IgniteException, Exception {
		log.info("start ignite...");
        return Ignition.start(ClientConfigurationFactory.createConfiguration());
    }
}
