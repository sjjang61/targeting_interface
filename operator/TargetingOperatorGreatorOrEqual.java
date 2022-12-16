package com.abtest.server.bo.targeting.operator;

public class TargetingOperatorGreatorOrEqual implements TargetingOperator {
    @Override
    public boolean operator( String compValue, String userValue ){
        return Integer.parseInt( userValue ) >= Integer.parseInt( compValue );
    }
}