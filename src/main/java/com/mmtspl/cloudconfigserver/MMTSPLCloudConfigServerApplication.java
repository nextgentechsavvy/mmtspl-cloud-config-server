package com.mmtspl.cloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
//@EnableDiscoveryClient
@SpringBootApplication
public class MMTSPLCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MMTSPLCloudConfigServerApplication.class, args);
	}

}
