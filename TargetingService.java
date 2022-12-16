package com.abtest.server.bo.targeting;

import com.abtest.server.model.TargetingCondition;
import com.abtest.server.bo.targeting.operator.TargetingOperator;
import com.abtest.server.bo.targeting.operator.TargetingOperatorFactory;
import com.abtest.server.bo.targeting.type.TargetingType;
import com.abtest.server.bo.targeting.type.TargetingTypeFactory;
import com.abtest.server.model.UserInfo;
import com.abtest.server.utils.HttpUtils;
import com.abtest.server.utils.JsonUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TargetingService {

    private final Logger logger = LoggerFactory.getLogger(TargetingService.class);

    @Value("${ext.targeting.url}")
    private String externalTargetingUrl;

    @Autowired
    private JsonUtils jsonUtils;

    @Autowired
    private HttpUtils httpUtils;

    // 내부에서 관리해야 할 경우
    public boolean isTargeting(List<TargetingCondition> targetingList ){

        for( TargetingCondition targeting : targetingList ){

            TargetingType targetingType = TargetingTypeFactory.valueOf( targeting.getType().toUpperCase() ).getInstance();
            TargetingOperator targetingOper = TargetingOperatorFactory.valueOf( targeting.getOper().toUpperCase() ).getInstance();

            // 사용자 변수는 어떻게 연동해야 할까?
            boolean isTargeting = targetingType.isTargeting( targetingOper, targeting.getValue(), "");
            if ( isTargeting == false ) {
                return false;
            }
        }

        // 모든 조건을 만족해야 True
        return true;
    }
}
