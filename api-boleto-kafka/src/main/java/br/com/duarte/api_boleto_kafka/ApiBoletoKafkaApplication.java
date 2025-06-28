package br.com.duarte.api_boleto_kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class ApiBoletoKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiBoletoKafkaApplication.class, args);
	}

}
