package li.jesse.javadevmessagequeue.rabbitmq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MqReceiver {

    @RabbitListener(queues = "myQueue")
    public void process(String message) {
//        log.info("hello {}", message);
        System.out.println("hello " + message);
    }
}
