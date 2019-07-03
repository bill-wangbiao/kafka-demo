package com.person.mq.java;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : wangbiao
 * @version V1.0
 * @Project: kafka-demo
 * @Package com.person.mq.java
 * @Description: TODO
 * @date Date : 2019年07月03日 20:53
 */
public class ProducerSample {
    public static void main(String[] args) {
        Map<String, Object> props = new HashMap<String, Object>();
        props.put("bootstrap.servers", "localhost:9092");
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        String topic = "test-topic";
        Producer<String, String> producer = new KafkaProducer<String, String>(props);
        producer.send(new ProducerRecord(topic, "idea-key2", "java-message 1"));
        producer.send(new ProducerRecord(topic, "idea-key2", "java-message 2"));
        producer.send(new ProducerRecord(topic, "idea-key2", "java-message 3"));

        producer.close();
    }
}
