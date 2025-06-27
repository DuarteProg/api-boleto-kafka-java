package br.com.duarte.api_boleto_kafka.service;

import br.com.duarte.api_boleto_kafka.controller.exception.ApplicationException;
import br.com.duarte.api_boleto_kafka.dto.BoletoDTO;
import br.com.duarte.api_boleto_kafka.entity.BoletoEntity;
import br.com.duarte.api_boleto_kafka.entity.enums.SituacaoBoleto;
import br.com.duarte.api_boleto_kafka.mapper.BoletoMapper;
import br.com.duarte.api_boleto_kafka.repositoy.BoletoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class BoletoService {

    @Autowired
    private BoletoRepository boletoRepository;



    public BoletoDTO salvar(String codigoBarras){
        var boletoOptional = boletoRepository.findByCodigoBarras(codigoBarras);
        if (boletoOptional.isPresent()){
            throw new ApplicationException("Já existe uma solicitação de pagamento para esse boleto");
        }

        var boletoEntity = BoletoEntity.builder()
                .codigoBarras(codigoBarras)
                .situacaoBoleto(SituacaoBoleto.INICIALIZADO)
                .dataCriacao(LocalDateTime.now())
                .dataAtualizacao(LocalDateTime.now())
                .build();

        boletoRepository.save(boletoEntity);
        return BoletoMapper.toDTO(boletoEntity);
    }
}
