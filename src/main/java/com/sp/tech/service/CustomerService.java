package com.sp.tech.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sp.tech.model.Address;
import com.sp.tech.model.Customer;
import com.sp.tech.repo.AddressRepo;
import com.sp.tech.repo.CustomerRepo;

@Service
public class CustomerService {

	@Autowired
	CustomerRepo customerRepo;

	@Autowired
	AddressRepo addressRepo;

	@Transactional
	public void saveCustomer() {
		Customer c1 = new Customer("Thaw Thaw", 24);
		Customer c2 = new Customer("Maw Maw", 24);
		Customer c3 = new Customer("Thaw Thaw Tun", 24);

		Address s1 = new Address("DreamLand", 3333333);
		Address s2 = new Address("Latha", 5555555);
		Address s3 = new Address("Dagon", 44444444);

		c1.setAddress(s1);
		c2.setAddress(s2);
		c3.setAddress(s3);

//		addressRepo.save(s1);
//		addressRepo.save(s2);
//		addressRepo.save(s3);

		customerRepo.save(c1);
		customerRepo.save(c2);
		customerRepo.save(c3);

	}

}
