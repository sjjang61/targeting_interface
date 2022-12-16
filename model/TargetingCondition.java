package com.abtest.server.model;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

@Getter
@Setter
public class TargetingCondition {
    private String type;
    private String oper;
    private String value;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}

/*
    @Test
    public void test_extParam_json_parser(){
        //String jsonParam = "{\"sex\" : \"female\",\"age\" : 10, \"os\" : \"android\", \"join_date\" : \"2022-05-16\" }";
        String jsonParam = "[{ \"type\" : \"sex1\", \"oper\" : \"equal\", \"value\" : \"male\" }, { \"type\" : \"sex2\", \"oper\" : \"equal\", \"value\" : \"male\" } ]";
        ObjectMapper mapper = new ObjectMapper();
        try {

            // convert JSON string to Map
            List<TargetingCondition> targetingList = Arrays.asList(mapper.readValue(jsonParam, TargetingCondition[].class));

            for ( TargetingCondition target : targetingList ){
                System.out.println( target );
            }

            //System.out.println( map.get("join_date"));


        } catch (IOException e) {
            e.printStackTrace();
        }
    }   
*/    
