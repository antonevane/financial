package com.stidham;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class StidhamFinancialApplication extends SpringBootServletInitializer {
    
	public static void main(String[] args) throws UnknownHostException {
	    SpringApplication app = new SpringApplication(StidhamFinancialApplication.class);
		
		Environment env = app.run(args).getEnvironment();
       System.out.println(String.format("Access URLs:\n----------------------------------------------------------\n\t" +
                "Local: \t\thttp://127.0.0.1:%1s\n\t" +
                "External: \thttp://%2s:%3s\n----------------------------------------------------------",
            env.getProperty("server.port"),
            InetAddress.getLocalHost().getHostAddress(),
            env.getProperty("server.port")));
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(StidhamFinancialApplication.class);
	}
}
