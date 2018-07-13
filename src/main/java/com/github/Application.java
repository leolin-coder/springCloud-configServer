package com.github;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableDiscoveryClient  // springcloud 客户端
@EnableConfigServer
public class Application {

    /**
     * 目前还是只能放在这里。   默认使用ribbon集群负载的时候使用
     * @return
     */
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

