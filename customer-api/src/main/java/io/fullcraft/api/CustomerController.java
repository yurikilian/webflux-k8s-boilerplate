package io.fullcraft.api;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping
public class CustomerController {

    private final String customerName;

    CustomerController(@Value("${customer.name}") final String customerName) {
        this.customerName = customerName;
    }

    @GetMapping("/{id}")
    public Mono<CustomerDto> searchById(@PathVariable final long id) {
        return Mono.just(new CustomerDto(id, customerName));
    }

}
