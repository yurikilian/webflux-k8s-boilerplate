package io.fullcraft.api.customer;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final WebClient customerWebClient;

    public Mono<CustomerDto> find(final long id) {
        return customerWebClient
                .get()
                .uri("" + id)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(CustomerDto.class);
    }
}
