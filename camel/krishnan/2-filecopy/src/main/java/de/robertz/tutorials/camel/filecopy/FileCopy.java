package de.robertz.tutorials.camel.filecopy;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class FileCopy {
	public static void main(String[] args) throws Exception {
		
		CamelContext context = new DefaultCamelContext();
		
		// RouteBuilder class, not interface!
		context.addRoutes(new RouteBuilder() {
			
			@Override
			public void configure() throws Exception {

				// component:endpoint?option
				from("file:input?noop=true")
					.to("file:out");
			}
		});
		
		while(true) {
			context.start();
		}
	}
}
