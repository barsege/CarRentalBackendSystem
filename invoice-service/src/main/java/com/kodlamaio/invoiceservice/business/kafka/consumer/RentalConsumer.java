package com.kodlamaio.invoiceservice.business.kafka.consumer;

import com.kodlamaio.commonpackage.events.rental.RentalInvoiceCreatedEvent;
import com.kodlamaio.commonpackage.utils.mappers.ModelMapperService;
import com.kodlamaio.invoiceservice.business.abstracts.InvoiceService;
import com.kodlamaio.invoiceservice.business.dto.requests.create.CreateInvoiceRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class RentalConsumer {

    private final InvoiceService service;
    private final ModelMapperService mapper;

    @KafkaListener(
            topics = "rental-invoice-created",
            groupId = "rental-invoice-create"
    )
    public void consume(RentalInvoiceCreatedEvent event) {
        var invoice = mapper.forRequest().map(event, CreateInvoiceRequest.class);
        service.add(invoice);
        log.info("(invoice) rental created event consumed {}", event);
    }
}
