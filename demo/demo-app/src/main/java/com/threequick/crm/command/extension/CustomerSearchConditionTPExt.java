package com.threequick.crm.command.extension;

import com.threequick.crm.command.extensionpoint.CustomerCheckConflictSearchConditionExtPt;
import com.threequick.crm.common.BizCode;
import com.alibaba.sofa.extension.Extension;

@Extension(bizCode = BizCode.TP)
public class CustomerSearchConditionTPExt implements CustomerCheckConflictSearchConditionExtPt {

    @Override
    public String getSearchCondition(String condition) {
        return "Trust Pass Search Condition";
    }

}
