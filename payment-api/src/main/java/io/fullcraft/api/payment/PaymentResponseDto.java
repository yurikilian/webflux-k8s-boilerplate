package io.fullcraft.api.payment;

import io.fullcraft.api.customer.CustomerDto;

record PaymentResponseDto(Double value, CustomerDto customer) {

}
