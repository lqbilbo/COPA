package com.threequick.crm.domain.customer.rule.extensionpoint;

import com.alibaba.sofa.extension.ExtensionPointI;
import com.alibaba.sofa.rule.RuleI;
import com.threequick.crm.domain.customer.entity.CustomerE;

/**
 * CustomerRuleExtPt
 *
 * @author Frank Zhang
 * @date 2018-01-07 12:03 PM
 */
public interface CustomerRuleExtPt extends RuleI, ExtensionPointI{

	//Different business check for different biz
	public boolean addCustomerCheck(CustomerE customerE);

	//Different upgrade policy for different biz
	default public void customerUpgradePolicy(CustomerE customerE){
		//Nothing special
	}
}