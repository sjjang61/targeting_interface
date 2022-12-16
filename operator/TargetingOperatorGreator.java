package com.abtest.server.bo.targeting.operator;

import org.apache.commons.lang3.StringUtils;

public class TargetingOperatorGreator implements TargetingOperator {
    @Override
    public boolean operator( String compValue, String userValue ){
        return Integer.parseInt( userValue ) > Integer.parseInt( compValue );
    }
}