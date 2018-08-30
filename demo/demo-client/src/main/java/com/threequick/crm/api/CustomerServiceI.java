package com.threequick.crm.api;

import com.threequick.crm.dto.CustomerAddCmd;
import com.threequick.crm.dto.CustomerCheckConflictCmd;
import com.threequick.crm.dto.CustomerFindByCriteriaQry;
import com.alibaba.sofa.dto.MultiResponse;
import com.alibaba.sofa.dto.Response;
import com.threequick.crm.dto.clientobject.CustomerCO;

public interface CustomerServiceI {

    public Response addCustomer(CustomerAddCmd customerAddCmd);
    
    public MultiResponse<CustomerCO> checkConflict(CustomerCheckConflictCmd customerCheckConflictCmd);
    
    public MultiResponse<CustomerCO> findByCriteria(CustomerFindByCriteriaQry CustomerFindByCriteriaQry);
}
