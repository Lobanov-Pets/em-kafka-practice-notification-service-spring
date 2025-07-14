package by.lobanov.notificationservice.listener;

import org.slf4j.*;
import org.springframework.kafka.annotation.*;
import org.springframework.stereotype.*;

@Component
public class ConfirmationCodeListener {

    Logger log = LoggerFactory.getLogger(ConfirmationCodeListener.class);

    @KafkaListener(topics = "${app.kafka.topic.confirmation-codes}", groupId = "${spring.kafka.consumer.group-id}")
    public void listen(String message) {
        log.info("--- [Spring Kafka] Received Confirmation Code ---");
        log.info("Message: {}", message);
        log.info("-------------------------------------------------");
    }
}
