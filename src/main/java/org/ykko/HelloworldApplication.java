package org.ykko;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class HelloworldApplication {

	private static final Logger log = LoggerFactory.getLogger(HelloworldApplication.class);

	public static void main(String[] args) throws Exception {
		SpringApplication.run(HelloworldApplication.class, args);
		Event event = new Event(1L, "agent-1", "hello", Utils.getFormattedCurrentTimestamp());
		ObjectMapper objectMapper = new ObjectMapper();
		log.info(objectMapper.writeValueAsString(event));
	}

}
