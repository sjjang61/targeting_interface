package com.abtest.server.bo.targeting.operator;

import org.apache.commons.lang3.StringUtils;

public class TargetingOperatorNotEqual implements TargetingOperator {
    @Override
    public boolean operator( String compValue, String userValue ){
        return !StringUtils.equals( compValue, userValue );
    }
}