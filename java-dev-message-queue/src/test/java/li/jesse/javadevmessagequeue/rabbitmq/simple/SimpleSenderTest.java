package li.jesse.javadevmessagequeue.rabbitmq.simple;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

@Component
@RunWith(SpringRunner.class)
@SpringBootTest
public class SimpleSenderTest {

    @Autowired
    private RabbitTemplate template;

    @Test
    public void send() {
        String message = "hello world";
        template.convertAndSend("ww", message);
        System.out.println("sent...");
    }

}
