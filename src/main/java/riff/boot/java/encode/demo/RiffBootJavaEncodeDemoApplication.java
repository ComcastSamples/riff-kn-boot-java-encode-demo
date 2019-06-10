package riff.boot.java.encode.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Base64;
import java.util.function.Function;

@SpringBootApplication
public class RiffBootJavaEncodeDemoApplication implements Function<String,String> {

	private static final Logger LOGGER= LoggerFactory.getLogger(RiffBootJavaEncodeDemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RiffBootJavaEncodeDemoApplication.class, args);
	}


	@Override
	public String apply(String s) {
		LOGGER.info("Received input------->"+s);

		String encodedString = Base64.getEncoder().encodeToString(s.getBytes());

		LOGGER.info("output----->  "+encodedString);
		return encodedString;
	}

}
