package com.person.mq.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.kafka.core.KafkaTemplate;

/**
 * @author : wangbiao
 * @version V1.0
 * @Project: kafka-demo
 * @Package com.person.mq.spring
 * @Description: TODO
 * @date Date : 2019年07月03日 20:54
 */
public class SpringProducer {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-kafka.xml");

        KafkaTemplate<String, String> kafkaTemplate = (KafkaTemplate) ctx.getBean("kafkaTemplate");
        kafkaTemplate.send("kafka-topic", "我的测试消息1");
        kafkaTemplate.send("kafka-topic", "我的测试消息2");
        kafkaTemplate.send("kafka-topic", "我的测试消息3");
    }
}
