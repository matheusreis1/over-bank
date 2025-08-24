package com.example.authservice.config;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;

@Configuration
public class RabbitMQConfig {
    @Value("service_gerente__response_inserir_gerente__dados_cadastro")
    private String responseInserirGerenteDadosCadastro;

    @Value("service_auth__criar_registro_cliente")
    private String criarRegistro;

    @Value("service_auth__enviar_dados_email")
    private String enviarDadosEmail;

    @Bean
    public Queue responseInserirGerenteDadosCadastroQueue(){
        return new Queue(responseInserirGerenteDadosCadastro, true);
    }

    @Bean
    public Queue criarRegistroClientQueue(){
        return new Queue(criarRegistro, true);
    }

    @Bean
    public Queue enviarDadosEmailQueue(){
        return new Queue(enviarDadosEmail, true);
    }

    @Bean
    public ObjectMapper objectMapper(){
        return JsonMapper.builder().findAndAddModules().build();
    }

    @Bean
    public Jackson2JsonMessageConverter producerJackson2MessageConverter() {
        Jackson2JsonMessageConverter converter = new Jackson2JsonMessageConverter();
        converter.setCreateMessageIds(true);
        return converter;
    }
}
