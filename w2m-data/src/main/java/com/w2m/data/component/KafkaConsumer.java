// package com.w2m.data.component;
//
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.kafka.annotation.KafkaListener;
// import org.springframework.kafka.core.KafkaTemplate;
// import org.springframework.kafka.support.Acknowledgment;
// import org.springframework.stereotype.Component;
// import org.springframework.transaction.annotation.Transactional;
//
// import com.fasterxml.jackson.databind.ObjectMapper;
// import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
//
// @Component
// public class KafkaConsumer {
//
// @Autowired
// private KafkaTemplate<String, String> kafkaTemplate;
//
// private final ObjectMapper mapper = new ObjectMapper();
//
// public KafkaConsumer() {
// this.mapper.registerModule(new JavaTimeModule());
// }
//
// @Transactional("transactionManager")
// @KafkaListener(topics = "ship_member", groupId = "my-group1")
// public void listen(final String msg, final Acknowledgment acknowledgment) {
//
// System.out.println(msg);
// acknowledgment.acknowledge();
//
// }
//
// }