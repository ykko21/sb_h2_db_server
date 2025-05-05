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

//		String[] agents = {"agent-1","agent-2","agent-3"};
//		int iteration = 1;
//		try {
//			if(args != null && args.length == 1) {
//				iteration = Integer.parseInt(args[0]);
//			}
//		} catch (Exception e) {
//			log.error("java -jar kinesis_producer_sb [interaction]");
//		}
//
//		for(int i=0; i<iteration; i++) {
//			for(int j=0; j<agents.length; j++) {
//				Event event = new Event(System.currentTimeMillis(), agents[i%agents.length], "Hello~", Utils.getFormattedCurrentTimestamp());
//			}
//		}
	}

}
