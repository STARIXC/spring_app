package com.starixc.hrhapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.starixc.hrhapp.models.Invoice;
@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {

}
