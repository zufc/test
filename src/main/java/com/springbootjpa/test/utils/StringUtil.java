package com.springbootjpa.test.utils;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zufeichao
 */
public class StringUtil {

    public static boolean nvl (String string){
        Map<String,Object> map = new HashMap<>();
        map.put("a","1");
        return StringUtils.isBlank(string);



    }
}
