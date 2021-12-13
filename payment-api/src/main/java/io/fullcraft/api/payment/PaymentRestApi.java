package io.fullcraft.api.payment;

import io.fullcraft.api.customer.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class PaymentRestApi {


    private final CustomerService customerService;

    @GetMapping
    public Mono<PaymentResponseDto> find() {
        return customerService.find(1L).map(customerDto -> new PaymentResponseDto(23.00, customerDto));
    }
}
