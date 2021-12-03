package com.qinh;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 测试不同的业务日志记录到不同的文件中
 *
 * @author Qh
 * @version 1.0
 * @date 2021/12/3 11:15
 */
public class LogTest {
    /**
     * 业务A的日志
     */
    private static final Logger businessALog = LoggerFactory.getLogger("businessALog");
    /**
     * 业务B的日志
     */
    private static final Logger businessBLog = LoggerFactory.getLogger("businessBLog");


    public static void main(String[] args){
        log();
    }

    private static void log() {
        //日志存储
        businessALog.info("修改了配送地址");
        businessBLog.info("业务B的日志");


    }
}
