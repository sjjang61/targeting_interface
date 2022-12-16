package com.abtest.server.bo.targeting.operator;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;

public class TargetingOperatorContains implements TargetingOperator {
    @Override
    public boolean operator( String compValue, String userValue ){

        List<String> valueList = Arrays.asList( compValue.replaceAll(" ", "" ).split(","));
        return valueList.contains( userValue );
    }
}