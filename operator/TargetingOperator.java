package com.abtest.server.bo.targeting.operator;


public interface TargetingOperator {
    public abstract boolean operator( String compValue, String userValue );
}