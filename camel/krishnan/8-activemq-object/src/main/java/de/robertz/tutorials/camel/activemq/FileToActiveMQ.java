package de.robertz.tutorials.camel.activemq;

import javax.jms.ConnectionFactory;

import org.apache.activemq.spring.ActiveMQConnectionFactory;
import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jms.JmsComponent;
import org.apache.camel.impl.DefaultCamelContext;


public class FileToActiveMQ {

	/*
	 * I got "wrong number of arguments" - see
	 * http://camel.465427.n5.nabble.com/Re-ActiveMQ-endpoint-in-Camel-3-0-0-reports-an-quot-java-lang-IllegalArgumentException-wrong-number--td5852046.html
	 */
	
	public static void main(String[] args) throws Exception {
		
		CamelContext context = new DefaultCamelContext();

		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
		context.addComponent("jms", JmsComponent.jmsComponentAutoAcknowledge(connectionFactory));
		
		context.addRoutes(new RouteBuilder() {
			
			@Override
			public void configure() throws Exception {
				from("file:input_box?noop=true").to("activemq:queue:camel_que");
			}
		});
	
		while(true)
			context.start();
	}

}
