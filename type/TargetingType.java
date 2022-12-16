package com.abtest.server.bo.targeting.type;

import com.abtest.server.bo.targeting.operator.TargetingOperator;

public interface TargetingType {
    public abstract boolean isTargeting(TargetingOperator targetingOperator, String compValue, String userValue );
}
