package com.threequick.crm.tunnel.datatunnel;

import java.util.List;

import com.alibaba.sofa.repository.DataTunnel;
import com.threequick.crm.tunnel.dataobject.CustomerDO;

public interface CustomerTunnelI extends DataTunnel<CustomerDO>{

    public List<CustomerDO> findByCriteria(String... params);

}
