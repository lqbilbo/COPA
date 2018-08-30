package com.threequick.crm.command.extensionpoint;

import com.alibaba.sofa.extension.ExtensionPointI;

public interface CustomerCheckConflictSearchConditionExtPt extends ExtensionPointI{
    
    public String getSearchCondition(String condition);
}
