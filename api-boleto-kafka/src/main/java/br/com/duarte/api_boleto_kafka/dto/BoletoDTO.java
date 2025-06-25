package br.com.duarte.api_boleto_kafka.dto;

import br.com.duarte.api_boleto_kafka.entity.enums.SituacaoBoleto;
import jakarta.persistence.Entity;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BoletoDTO {

    private String codigoBarras;

    private SituacaoBoleto situacaoBoleto;

    private LocalDateTime dataCriacao;

    private  LocalDateTime dataAtualizacao;
}
