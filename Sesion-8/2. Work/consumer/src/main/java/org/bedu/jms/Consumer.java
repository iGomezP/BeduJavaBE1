package org.bedu.jms;

import lombok.extern.slf4j.Slf4j;
import org.bedu.jms.model.Email;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

// Lombock inyecta el logger completo
@Slf4j
@Component
public class Consumer {

    // Indicamos que el método se active cuando esa cola reciba un mensaje
    @RabbitListener(queues = {"${hsbc.queue}"})
    public void consume(Email email){
        log.info("Mensaje recibido...");
        log.info(email.toString());
    }
}
