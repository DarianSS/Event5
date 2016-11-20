package com.event5.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.event5.model.Response;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String args[]) {
		SpringApplication.run(Application.class);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			Response response = restTemplate.getForObject(
					"https://graph.facebook.com/search?q=dornoch&type=event&access_token=EAAJzDEJrRf4BADSY86YGZBStUx276PXvMKZBKrPjuzGjoCuh7crLZALXyLhvAIUor1Y8tbFOiHI58K6HzFOA6lsfXhIiGbiRJe0jCve28eIcZA8SMdMfTHHS3rq4i5UyRtBPIm2ZBQ60XB919oKfTZCIwJoFb9LPYaB9GV0Ww2QwZDZD", Response.class);
			log.info(response.toString());
		};
	}
}
