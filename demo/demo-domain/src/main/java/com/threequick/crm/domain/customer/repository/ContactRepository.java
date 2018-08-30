package com.threequick.crm.domain.customer.repository;

import java.util.Set;

import org.springframework.stereotype.Repository;

import com.alibaba.sofa.context.TenantContext;
import com.alibaba.sofa.repository.RepositoryI;
import com.threequick.crm.domain.customer.entity.ContactE;

@Repository
public class ContactRepository implements RepositoryI {

	public Set<ContactE> queryContactByGlobalId(String globalId, String type){
		TenantContext.getTenantId();
		TenantContext.getBizCode();
		return null;
	}

}
