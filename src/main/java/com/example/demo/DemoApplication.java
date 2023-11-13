//run from java -jar demo-0.0.1-SNAPSHOT.jar --server.port=8080
//jar is in /home/bhrigu/me_and_x86_64/java/packaged\ projects/demo/demo/target/demo-0.0.1-SNAPSHOT.jar
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
