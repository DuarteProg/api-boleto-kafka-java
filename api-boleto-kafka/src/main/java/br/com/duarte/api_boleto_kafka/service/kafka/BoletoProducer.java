package br.com.duarte.api_boleto_kafka.service.kafka;

import br.com.duarte.api_boleto_kafka.avro.Boleto;
import br.com.duarte.api_boleto_kafka.dto.BoletoDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class BoletoProducer {

    @Value("${spring.kafka.topico-boleto}")
    public String topico;

    private final KafkaTemplate<String, Boleto> kafkaTemplate;

    public BoletoProducer(KafkaTemplate<String, Boleto> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void enviarMensagem(Boleto boleto) {
        kafkaTemplate.send(topico, boleto);
    }
}
