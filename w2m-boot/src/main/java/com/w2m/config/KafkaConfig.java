package com.w2m.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfig {

	// @Bean
	// public ReplyingKafkaTemplate<String, String, String> replyingKafkaTemplate(final
	// ProducerFactory<String, String> pf,
	// final KafkaMessageListenerContainer<String, String> container) {
	// final ReplyingKafkaTemplate template = new ReplyingKafkaTemplate<>(pf, container);
	// template.setDefaultReplyTimeout(Duration.ofMillis(20000));
	// template.setTransactionIdPrefix("tx-");
	// return template;
	// }
	//
	// @Bean
	// public KafkaMessageListenerContainer<String, String> replyContainer(final
	// ConsumerFactory<String, String> cf) {
	// final ContainerProperties containerProperties = new
	// ContainerProperties("replyTopic");
	// return new KafkaMessageListenerContainer<>(cf, containerProperties);
	// }

}
