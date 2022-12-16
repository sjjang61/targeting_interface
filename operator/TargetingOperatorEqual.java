package com.abtest.server.bo.targeting.operator;

import org.apache.commons.lang.math.NumberUtils;
import org.apache.commons.lang3.StringUtils;

public class TargetingOperatorEqual implements TargetingOperator {
    @Override
    public boolean operator( String compValue, String userValue ){

        if( NumberUtils.isNumber( compValue ) && NumberUtils.isNumber( userValue )){
            return ( compValue == userValue );
        }
        return StringUtils.equals( compValue, userValue );
    }
}