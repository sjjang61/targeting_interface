package com.abtest.server.bo.targeting.type;

import com.abtest.server.bo.targeting.operator.TargetingOperator;
import com.abtest.server.utils.HttpUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TargetingTypeJoinDate implements TargetingType{

    private final Logger logger = LoggerFactory.getLogger(TargetingTypeJoinDate.class);

    @Autowired
    //@Qualifier("taskExecutor")
    //private RestTemplate restTemplate;
    private HttpUtils httpUtils;

    @Value("${ext.targeting.url}")
    private String externalTargetingUrl;

    @Override
    public boolean isTargeting(TargetingOperator targetingOperator, String compValue, String userValue) {

        logger.info("url = {}", externalTargetingUrl );

//        String response = httpUtils.get( "http://43.201.154.250/" );
//        logger.info("response = {}", response );



        // 가입일 정보는 어떻게 가져올까?
        // 현수님이 만든 UPS-API 에서 가져오는것으로... (http rest-api)
        return false;
    }
}