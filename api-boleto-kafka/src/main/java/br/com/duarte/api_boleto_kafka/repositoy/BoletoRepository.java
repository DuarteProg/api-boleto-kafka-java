package br.com.duarte.api_boleto_kafka.repositoy;

import br.com.duarte.api_boleto_kafka.entity.BoletoEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface BoletoRepository extends CrudRepository<BoletoEntity, Long> {

    Optional<BoletoEntity> findByCodigoBarras(String codigoBarras);
}
