package com.github.kfcfans.powerjob.server.common;

/**
 * 配置文件 key
 *
 * @author tjq
 * @since 2020/8/2
 */
public class PowerJobServerConfigKey {

    /**
     * akka 端口号
     */
    public static final String AKKA_PORT = "oms.akka.port";
    /**
     * alarm bean 名称，多值逗号分隔
     */
    public static final String ALARM_BEAN_NAMES = "oms.alarm.bean.names";
    /**
     * 自定义数据库表前缀
     */
    public static final String TABLE_PREFIX = "oms.table-prefix";
    /**
     * 是否使用 mongoDB
     */
    public static final String MONGODB_ENABLE = "oms.mongodb.enable";
}
