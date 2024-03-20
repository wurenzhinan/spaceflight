package com.qrsoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.io.IOException;
import java.net.URISyntaxException;

@SpringBootApplication
@EnableScheduling
public class BigDataKongGuanApplication{
    public static ConfigurableApplicationContext appConfig;
    public static void main(String[] args)	throws IOException, URISyntaxException, InterruptedException {
        appConfig = SpringApplication.run(BigDataKongGuanApplication.class, args);
    }
}