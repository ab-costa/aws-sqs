package br.com.abcosta.aws.sqs;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.abcosta.aws.sqs.services.SQSService;

@SpringBootApplication
public class SqsApplication {

	public static void main(String[] args) {
		SQSService.sendMessage("MENSAGEM DE TESTE PARA SQS - " + LocalDate.now());
	}

}
