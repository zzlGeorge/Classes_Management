package com.lzGeorge.app.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by admin on 2017/6/21.
 */
public class BackMessage extends HashMap {
    private static int SUEECSS = 1;
    private static int ERROR = -1;

    private static String RESULT = "result";
    private static String DESC = "description";

    private static BackMessage backMessageInstance = new BackMessage();

    private BackMessage() {

    }

    /**
     * 成功提示
     *
     * @param successMsg 成功时返回的信息描述
     */
    public static BackMessage success(String successMsg) {
        BackMessage backMessage = getInstance();
        backMessage.clear();
        backMessage.put(RESULT, SUEECSS);
        backMessage.put(DESC, successMsg);
        return backMessage;
    }

    /**
     * 带数据的返回
     *
     * @param msg  描述信息
     * @param key  数据值的key值
     * @param data 源数据
     */
    public static BackMessage successData(String msg, String key, Object data) {
        BackMessage backMessage = getInstance();
        backMessage.clear();
        backMessage.put(RESULT, SUEECSS);
        backMessage.put(DESC, msg);
        backMessage.put(key, data);
        return backMessage;
    }

    /**
     * 请求失败时的提示
     *
     * @param errorMsg 错误时的提示信息
     */
    public static BackMessage error(String errorMsg) {
        BackMessage backMessage = getInstance();
        backMessage.clear();
        backMessage.put(RESULT, ERROR);
        backMessage.put(DESC, errorMsg);
        return backMessage;
    }

    /*获取单例*/
    public static BackMessage getInstance() {
        return backMessageInstance;
    }

}
