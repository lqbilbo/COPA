package com.threequick.crm.domain.customer.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.sofa.domain.DomainFactoryI;
import com.threequick.crm.domain.customer.entity.CustomerE;
import com.threequick.crm.domain.customer.repository.ContactRepository;

@Component
public class CustomerDomainFactory implements DomainFactoryI<CustomerE>{

	@Autowired
	private ContactRepository contactRepository;

	public CustomerE create(){
		return new CustomerE();
	}

}
