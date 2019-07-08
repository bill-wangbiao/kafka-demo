package com.person.mq.log;

import org.apache.log4j.Logger;

/**
 * @author : wangbiao
 * @version V1.0
 * @Project: kafka-demo
 * @Package com.person.mq.log
 * @Description: TODO
 * @date Date : 2019年07月03日 20:47
 */
public class TestLog4j2Kafka2 {
    private static Logger logger = Logger.getLogger(TestLog4j2Kafka2.class);

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i <= 5; i++) {

            logger.info("this is a message produced from TestLog4j2Kafka 2 [" + i + "]......");

            Thread.sleep(1000);
        }
    }
}
