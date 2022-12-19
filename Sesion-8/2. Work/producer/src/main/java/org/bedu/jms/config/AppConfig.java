package org.bedu.jms.config;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    // Directiva @Value es para traer valores del application.properties - mejor practica
    @Value("${hsbc.exchange}")
    private String TOPIC_EXCHANGE_NAME;

    @Value("${hsbc.queue}")
    private String QUEUE_NAME;

    @Value("${hsbc.routing}")
    private String ROUTING_KEY;

    // Exchange: por donde entran los mensajes
    // Bean = objeto
    // Componente = clase completa
    @Bean
    public TopicExchange exchange(){
        return new TopicExchange(TOPIC_EXCHANGE_NAME);
    }

    // Queue: por donde salen los mensajes
    @Bean
    public Queue queue(){
        return new Queue(QUEUE_NAME);
    }

    //Liga entre Topic y queue
    @Bean
    public Binding binding(Queue queue, TopicExchange exchange){
        return BindingBuilder.bind(queue).to(exchange).with(ROUTING_KEY);
    }

    /**
     * En una aplicación puede haber multiples puntos de salida, estos se configuran como un Bean separado por cada salida
     */


    // Enviar en JSON
    // Cuando el mensaje sale se convierte en JSON, viaja y cuando llegue al consumidor, debe convertirse de JSON a java
    // De lo contrario se tienen que manejar cadenas de texto
    @Bean
    public MessageConverter converter(){
        return new Jackson2JsonMessageConverter();
    }

    // Instancia de RabbitMQ a utilizar
    // Permite enviar y escuchar mensajes
    @Bean
    public AmqpTemplate template(ConnectionFactory factory, MessageConverter converter){
        RabbitTemplate template = new RabbitTemplate(factory);
        template.setMessageConverter(converter);
        return template;
    }

}
