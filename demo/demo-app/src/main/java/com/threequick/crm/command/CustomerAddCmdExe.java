package com.threequick.crm.command;

import com.threequick.crm.domain.customer.convertor.extensionpoint.CustomerConvertorExtPt;
import com.threequick.crm.domain.customer.entity.CustomerE;
import com.alibaba.sofa.extension.ExtensionExecutor;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.sofa.command.Command;
import com.alibaba.sofa.command.CommandExecutorI;
import com.alibaba.sofa.dto.Response;
import com.threequick.crm.dto.CustomerAddCmd;
import com.threequick.crm.validator.extensionpoint.CustomerAddValidatorExtPt;
import com.alibaba.sofa.validator.ValidatorExecutor;

@Command
public class CustomerAddCmdExe implements CommandExecutorI<Response, CustomerAddCmd>{

    @Autowired
    private ValidatorExecutor  validatorExecutor;

    @Autowired
    private ExtensionExecutor extensionExecutor;

    @Override
    public Response execute(CustomerAddCmd cmd) {
        //1, validation
    	validatorExecutor.validate(CustomerAddValidatorExtPt.class, cmd);
    	
        //2, invoke domain service or directly operate domain to do business logic process
        CustomerE customerEntity = extensionExecutor.execute(CustomerConvertorExtPt.class, extension -> extension.clientToEntity(cmd.getCustomer()));
        customerEntity.addNewCustomer();

        //3, notify by sending message out
        return Response.buildSuccess();
    }

}
