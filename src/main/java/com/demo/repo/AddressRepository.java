package com.demo.repo;

import com.demo.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AddressRepository extends JpaRepository<Address, Long> {
    List<Address> findByReferenceIdAndReferenceType(Long referenceId, Integer referenceType);
}