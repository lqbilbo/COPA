package com.threequick.crm.dto;

import com.threequick.crm.dto.clientobject.CustomerCO;
import com.alibaba.sofa.dto.Command;
import lombok.Data;

@Data
public class CustomerAddCmd extends Command{

    private CustomerCO customer;
    
}
