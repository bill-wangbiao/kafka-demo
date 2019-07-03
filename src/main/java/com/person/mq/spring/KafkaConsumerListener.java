package com.person.mq.spring;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.listener.MessageListener;

/**
 * @author : wangbiao
 * @version V1.0
 * @Project: kafka-demo
 * @Package com.person.mq.spring
 * @Description: TODO
 * @date Date : 2019年07月03日 20:54
 */
public class KafkaConsumerListener implements MessageListener<String, String> {
    /**
     * 监听器自动执行该方法
     * 消费消息
     * 自动提交offset
     *
     * @param record
     */
    @Override
    public void onMessage(ConsumerRecord<String, String> record) {
        System.out.printf("partition = %d, offset = %d, key = %s, value = %s%n", record.partition(), record.offset(), record.key(), record.value());
    }
}
