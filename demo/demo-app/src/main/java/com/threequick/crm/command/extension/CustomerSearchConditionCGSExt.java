package com.threequick.crm.command.extension;

import com.threequick.crm.command.extensionpoint.CustomerCheckConflictSearchConditionExtPt;
import com.threequick.crm.common.BizCode;
import com.alibaba.sofa.extension.Extension;

@Extension(bizCode = BizCode.CGS)
public class CustomerSearchConditionCGSExt implements CustomerCheckConflictSearchConditionExtPt {

    @Override
    public String getSearchCondition(String condition) {
        return "CGS Search Condition";
    }

}
