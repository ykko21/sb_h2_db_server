package org.ykko;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.h2.tools.Server;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
@Slf4j
public class H2ServerApplication implements CommandLineRunner {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(H2ServerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Start H2 TCP server (port 9092 by default)
		Server server = Server.createTcpServer(
				"-tcpPort", "9092",      // Port clients will use
				"-tcpAllowOthers",       // Allow connections from other machines
				"-ifNotExists"           // Only start if not already running
		).start();

		log.info("H2 TCP server started at: {}", server.getURL());
	}

}
