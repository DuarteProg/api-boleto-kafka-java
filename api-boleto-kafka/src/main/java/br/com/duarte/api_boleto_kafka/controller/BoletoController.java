package br.com.duarte.api_boleto_kafka.controller;

import br.com.duarte.api_boleto_kafka.dto.BoletoDTO;
import br.com.duarte.api_boleto_kafka.dto.BoletoRequestDTO;
import br.com.duarte.api_boleto_kafka.service.BoletoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/boleto")
public class BoletoController {

    @Autowired
    private BoletoService boletoService;

    @PostMapping
    public ResponseEntity<BoletoDTO> salvar(@Valid @RequestBody BoletoRequestDTO boletoRequestDTO) {
        var boleto = boletoService.salvar(boletoRequestDTO.getCodigoBarras());
        return new ResponseEntity<>(boleto, HttpStatus.CREATED);
    }
}
