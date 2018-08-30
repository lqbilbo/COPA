package com.threequick.crm.validator;

import org.springframework.stereotype.Component;

import com.alibaba.sofa.logger.Logger;
import com.alibaba.sofa.logger.LoggerFactory;
import com.threequick.crm.dto.CustomerAddCmd;
import com.threequick.crm.validator.extensionpoint.CustomerAddValidatorExtPt;

@Component
public class CustomerAddValidator implements CustomerAddValidatorExtPt {

	private Logger logger = LoggerFactory.getLogger(CustomerAddValidator.class);
	
	@Override
	public void validate(Object candidate) {
		logger.debug("Do common validation");
		CustomerAddCmd addCmd = (CustomerAddCmd)candidate;
	}
}
