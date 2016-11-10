package org.cyxl.cloud.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by jeff on 16/11/10.
 */
@SpringBootApplication
@EnableConfigServer
public class CloudConfigServerApp {
    public static void main(String[] args){
        SpringApplication.run(CloudConfigServerApp.class, args);
    }
}
