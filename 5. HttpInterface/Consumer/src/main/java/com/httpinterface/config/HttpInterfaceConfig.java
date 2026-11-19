package com.httpinterface.config;

import com.httpinterface.client.ProducerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.support.RestClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class HttpInterfaceConfig {

    @Bean
    public ProducerClient producerClient() {
        RestClient restClient =
                RestClient.create();
        HttpServiceProxyFactory httpServiceProxyFactory =
                HttpServiceProxyFactory.builderFor(RestClientAdapter.create(restClient)).build();
        return httpServiceProxyFactory.createClient(ProducerClient.class);
    }
}
