package org.bedu.jms;

import lombok.extern.slf4j.Slf4j;
import org.bedu.jms.model.Email;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Slf4j
@Component
public class Producer implements CommandLineRunner {

    @Value("${hsbc.exchange}")
    private String TOPIC_EXCHANGE_NAME;

    @Value("${hsbc.routing}")
    private String ROUTING_KEY;

    private RabbitTemplate template;

    public Producer(RabbitTemplate template){
        this.template = template;
    }

    @Override
    public void run(String... args) throws Exception {
      log.info("Enviando mensaje...");
      // Para enviar el mensaje se utiliza la llave de ruteo y el exchange
        template.convertAndSend(
                TOPIC_EXCHANGE_NAME,
                ROUTING_KEY,
                new Email(
                        "Correo importante",
                        "vakzor@vakzor.com",
                        "ofertones@estafas.com",
                        "Tienes una nueva oferta"
                ));
    }
}
