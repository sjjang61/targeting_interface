package com.abtest.server.bo.targeting.type;

import com.abtest.server.bo.targeting.operator.TargetingOperator;

public class TargetingTypeSex implements TargetingType{
    @Override
    public boolean isTargeting(TargetingOperator targetingOperator, String compValue, String userValue) {
        return false;
    }
}