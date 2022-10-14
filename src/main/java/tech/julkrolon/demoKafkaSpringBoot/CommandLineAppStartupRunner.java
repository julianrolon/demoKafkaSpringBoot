package tech.julkrolon.demoKafkaSpringBoot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import tech.julkrolon.demoKafkaSpringBoot.producers.KafkaStringProducer;

@Component
public class CommandLineAppStartupRunner implements CommandLineRunner {
    private final KafkaStringProducer kafkaStringProducer;


    public CommandLineAppStartupRunner(KafkaStringProducer kafkaStringProducer) {
        this.kafkaStringProducer = kafkaStringProducer;
    }


    @Override
    public void run(String... args) throws Exception {
        for (int i = 0; i < 10; i++) {
            kafkaStringProducer.sendMessage("Hallo KAFka !! "+ i);
            Thread.sleep(2000);
        }
    }
}
