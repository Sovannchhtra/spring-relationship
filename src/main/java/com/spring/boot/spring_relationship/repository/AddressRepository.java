package com.spring.boot.spring_relationship.repository;

import com.spring.boot.spring_relationship.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Integer> {
}
