package com.employee.employee.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.employee.employee.domain.Address;

@FeignClient("ADDRESS-SERVICE")
public interface AddressClient {

	
	@GetMapping("/address/{addressId}")
	public Address getAddress(@PathVariable Long addressId);
}
