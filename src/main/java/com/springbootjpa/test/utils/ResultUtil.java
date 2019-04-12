package com.springbootjpa.test.utils;

import com.springbootjpa.test.dto.ResponseDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author  zufeichao
 */
public class ResultUtil {

    public final static String CODE = "code";
    public final static String MSG = "msg";
    public final static String DATA = "data";
    private static Logger logger = LoggerFactory.getLogger(ResultUtil.class);

    /**
     * 只有结果的返回数据
     * @return
     */
    public static ResponseDto getResult(){
        ResponseDto result = new ResponseDto();
        result.setCode("OK");
        result.setMsg("success");
        return result;
    }
    public static ResponseDto getResult(String msg){
        ResponseDto result = new ResponseDto();
        result.setMsg(msg);
        return result;
    }

    public static ResponseDto getResult(Object obj){
        ResponseDto result = new ResponseDto();
        result.setData(obj);
        return result;
    }





}
