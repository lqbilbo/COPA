package com.threequick.crm.domain.customer.convertor.extension;

import com.threequick.crm.common.AppConstants;
import com.threequick.crm.common.BizCode;
import com.threequick.crm.tunnel.dataobject.CustomerDO;
import com.threequick.crm.domain.customer.convertor.CustomerConvertor;
import com.threequick.crm.domain.customer.convertor.extensionpoint.CustomerConvertorExtPt;
import com.threequick.crm.domain.customer.entity.CustomerE;
import com.threequick.crm.domain.customer.valueobject.SourceType;
import com.threequick.crm.dto.clientobject.CustomerCO;
import com.alibaba.sofa.extension.Extension;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * CustomerCGSConvertorExt
 *
 * @author Frank Zhang
 * @date 2018-01-07 3:05 AM
 */
@Extension(bizCode = BizCode.CGS)
public class CustomerCGSConvertorExt implements CustomerConvertorExtPt {

    @Autowired
    private CustomerConvertor customerConvertor;//Composite basic convertor to do basic conversion

    @Override
    public CustomerE clientToEntity(CustomerCO customerCO){
        CustomerE customerEntity = customerConvertor.clientToEntity(customerCO);
        //In this business, if customers from RFQ and Advertisement are both regarded as Advertisement
        if(AppConstants.SOURCE_AD.equals(customerCO.getSource()) || AppConstants.SOURCE_RFQ.equals(customerCO.getSource()))
        {
            customerEntity.setSourceType(SourceType.AD);
        }
        return customerEntity;
    }

    public CustomerCO dataToClient(CustomerDO customerDO){
        return customerConvertor.dataToClient(customerDO);
    }
}
