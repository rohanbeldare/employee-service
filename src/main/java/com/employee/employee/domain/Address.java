package com.employee.employee.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
public class Address {
	static final long serialVersionUID = 1L;
	@Id
	private Long addressId;
	private String address;

	public Long getAddressId() {
		return addressId;
	}

	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
