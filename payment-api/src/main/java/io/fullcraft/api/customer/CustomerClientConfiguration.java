package io.fullcraft.api.customer;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
@RequiredArgsConstructor
public class CustomerClientConfiguration {

    @Bean
    public WebClient customerWebClient() {
        return WebClient.builder()
                .baseUrl("http://localhost:9595")
                .build();
    }

}
