package br.com.duarte.api_boleto_kafka.controller.exception;

public class ApplicationException extends RuntimeException{

    public ApplicationException(String message) {
        super(message);
    }
}
