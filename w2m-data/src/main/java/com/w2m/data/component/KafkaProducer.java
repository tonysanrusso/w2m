// package com.w2m.data.component;
//
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.kafka.core.KafkaTemplate;
// import org.springframework.stereotype.Component;
//
// @Component
// public class KafkaProducer {
//
// @Autowired
// private KafkaTemplate<String, String> kafkaTemplate;
//
// public void sendMessage(final String message, final String topicName) {
// this.kafkaTemplate.send(topicName, message);
// }
//
// }