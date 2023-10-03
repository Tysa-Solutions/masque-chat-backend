package com.masquechat.context;

import com.masquechat.repo.MessageRepository;
import com.masquechat.service.MessageService;
import com.masquechat.service.impl.MessageServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServicesConfig {
    @Bean
    public MessageRepository messageRepository() {
        return new MessageRepository();
    }
    @Bean
    public MessageService messageService(MessageRepository messageRepository) {
        return new MessageServiceImpl(messageRepository);
    }
}
