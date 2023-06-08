package com.kodlamaio.invoiceservice.repository;

import com.kodlamaio.invoiceservice.entity.Invoice;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InvoiceRepository extends MongoRepository<Invoice, String> {
}
