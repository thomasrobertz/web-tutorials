package de.robertz.tutorials.camel.helloworld;

import org.apache.camel.builder.RouteBuilder;

public class HelloWorldRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		System.out.println("Hello World!");
	}

}
