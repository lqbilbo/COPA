package com.threequick.crm.tunnel.datatunnel.impl;

import com.threequick.crm.tunnel.dataobject.CustomerDO;
import com.threequick.crm.tunnel.datatunnel.CustomerTunnelI;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public class CustomerDBTunnel implements CustomerTunnelI {

    @Override
    public CustomerDO create(CustomerDO customerDo) {
        return new CustomerDO();
    }
    
    @Override
    public void update(CustomerDO customerDo) {
        
    }
    
    @Override
    public CustomerDO get(String id) {
        CustomerDO customerDo = new CustomerDO();//just for demo
        return customerDo;
    }

    @Override
    public List<CustomerDO> findByCriteria(String... params) {
        return null;
    }

	@Override
	public List<CustomerDO> getByEntity(CustomerDO arg0) {
		return null;
	}

}
