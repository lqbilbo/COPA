package com.threequick.crm.service;

import com.threequick.crm.dto.CustomerCheckConflictCmd;
import com.threequick.crm.dto.CustomerFindByCriteriaQry;
import com.alibaba.sofa.command.CommandBusI;
import com.alibaba.sofa.dto.MultiResponse;
import com.alibaba.sofa.dto.Response;
import com.threequick.crm.api.CustomerServiceI;
import com.threequick.crm.dto.CustomerAddCmd;
import com.threequick.crm.dto.clientobject.CustomerCO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Note that HSFProvider requires Pandora Container. You can comment it out during development time.
 */
//@HSFProvider(serviceInterface = CustomerServiceI.class)
@Service
public class CustomerServiceImpl implements CustomerServiceI {

    @Autowired
    private CommandBusI commandBus;
    
    @Override
    public Response addCustomer(CustomerAddCmd customerAddCmd) {
        return (Response)commandBus.send(customerAddCmd);
    }

    @Override
    public MultiResponse<CustomerCO> checkConflict(CustomerCheckConflictCmd customerCheckConflictCmd) {
        return (MultiResponse<CustomerCO>)commandBus.send(customerCheckConflictCmd);
    }

    @Override
    public MultiResponse<CustomerCO> findByCriteria(CustomerFindByCriteriaQry CustomerFindByCriteriaQry) {
        return (MultiResponse<CustomerCO>)commandBus.send(CustomerFindByCriteriaQry);
    }

}
