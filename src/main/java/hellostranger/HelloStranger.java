package hellostranger;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloStranger {

	private static final Logger log = LoggerFactory.getLogger(HelloStranger.class);

	public static void main(String... args) {
		Customer customer = new Customer(UUID.randomUUID(), "Wanderlei Souza");
		log.info(customer.toString());
	}

}
