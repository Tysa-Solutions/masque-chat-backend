package com.tysa.masquechat.context;

import com.tysa.masquechat.chat.repo.MessageRepository;
import com.tysa.masquechat.chat.service.MessageService;
import com.tysa.masquechat.chat.service.impl.MessageServiceImpl;
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
