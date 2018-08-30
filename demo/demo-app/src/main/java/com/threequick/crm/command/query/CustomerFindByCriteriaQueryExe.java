package com.threequick.crm.command.query;

import com.threequick.crm.domain.customer.convertor.CustomerConvertor;
import com.threequick.crm.tunnel.dataobject.CustomerDO;
import com.threequick.crm.tunnel.datatunnel.CustomerTunnelI;
import com.threequick.crm.dto.CustomerFindByCriteriaQry;
import com.threequick.crm.dto.clientobject.CustomerCO;
import com.alibaba.sofa.command.Command;
import com.alibaba.sofa.command.QueryExecutorI;
import com.alibaba.sofa.dto.MultiResponse;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Command
public class CustomerFindByCriteriaQueryExe implements QueryExecutorI<MultiResponse<CustomerCO>, CustomerFindByCriteriaQry> {

    @Autowired
    CustomerTunnelI customerDBTunnel;

    @Autowired
    CustomerConvertor customerConvertor;

    @Override
    public MultiResponse<CustomerCO> execute(CustomerFindByCriteriaQry cmd) {
        CustomerDO customerDO = customerDBTunnel.get("123");
        List<CustomerCO> customerCos = new ArrayList<>();
        customerCos.add(customerConvertor.dataToClient(customerDO));
        return MultiResponse.of(customerCos, customerCos.size());
    }


    public CustomerDO get(String id) {
        CustomerDO customerDO = customerDBTunnel.get("123");
        return customerDO;
    }
}
