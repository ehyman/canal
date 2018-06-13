package com.alibaba.otter.canal.kafka.client.running;

import org.junit.Assert;

/**
 * Kafka 测试基类
 *
 * @author machengyuan @ 2018-6-12
 * @version 1.0.0
 */
public abstract class AbstractKafkaTest {

    public static String topic = "example";
    public static Integer partition = null;
    public static String groupId    = "g1";
    public static String servers    = "slave1.test.apitops.com:6667,slave2.test.apitops.com:6667,slave3.test.apitops.com:6667";

    public void sleep(long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            Assert.fail(e.getMessage());
        }
    }
}
