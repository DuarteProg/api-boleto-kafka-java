package br.com.duarte.api_boleto_kafka.mapper;


import br.com.duarte.api_boleto_kafka.avro.Boleto;
import br.com.duarte.api_boleto_kafka.dto.BoletoDTO;
import br.com.duarte.api_boleto_kafka.entity.BoletoEntity;

public class BoletoMapper {

    public static BoletoDTO toDTO(BoletoEntity boleto) {
        return BoletoDTO.builder()
                .codigoBarras(boleto.getCodigoBarras())
                .situacaoBoleto(boleto.getSituacaoBoleto())
                .dataCriacao(boleto.getDataCriacao())
                .dataAtualizacao(boleto.getDataAtualizacao())
                .build();
    }

    public static Boleto toAvro(BoletoEntity boleto) {
        return Boleto.newBuilder()
                .setCodigoBarras(boleto.getCodigoBarras())
                .setSituacaoBoleto(boleto.getSituacaoBoleto().ordinal())
                .build();
    }

}
