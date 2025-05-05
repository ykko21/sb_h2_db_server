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

//		private Long messageId;
//		private String agentId;
//		private String message;
//		private String timestamp;
		String json = "{\"messageId\":1746403348088,\"agentId\":\"agent-1\",\"message\":\"Hello~\",\"timestamp\":\"2025-05-04 20:02:28.089\"}";
		ObjectMapper objectMapper = new ObjectMapper();
		Event event = objectMapper.readValue(json, Event.class);
		System.out.println(event.getMessageId());
		System.out.println(event.getAgentId());
		System.out.println(event.getMessage());
		System.out.println(event.getTimestamp());


//		SpringApplication.run(HelloworldApplication.class, args);
//		Event event = new Event(1L, "agent-1", "hello", Utils.getFormattedCurrentTimestamp());
//		ObjectMapper objectMapper = new ObjectMapper();
//		log.info(objectMapper.writeValueAsString(event));

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
