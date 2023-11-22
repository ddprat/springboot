package com.SharathInfotech.PoServices.repository;

import com.SharathInfotech.PoServices.model.PO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Porepo extends JpaRepository<PO,Long> {
}
