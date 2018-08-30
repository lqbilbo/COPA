package com.threequick.crm.assembler;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.sofa.assembler.AssemblerI;
import com.threequick.crm.dto.clientobject.CustomerCO;

public class CustomerAssembler implements AssemblerI{

	public Map<String, String> assembleQueryParam(CustomerCO customerCO) {
		
		return new HashMap<>();
	}
}
