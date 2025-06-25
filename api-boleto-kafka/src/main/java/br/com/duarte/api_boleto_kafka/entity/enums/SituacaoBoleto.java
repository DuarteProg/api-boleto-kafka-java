package br.com.duarte.api_boleto_kafka.entity.enums;

public enum SituacaoBoleto {

    INICIALIZADO,
    VALIDADO,
    ERRO_VALIDACAO,
    PAGO,
    ERRO_PAGAMENTO
}
