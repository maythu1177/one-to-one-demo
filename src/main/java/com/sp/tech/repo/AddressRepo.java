package com.sp.tech.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sp.tech.model.Address;

@Repository
public interface AddressRepo extends JpaRepository<Address,Integer> {

}
