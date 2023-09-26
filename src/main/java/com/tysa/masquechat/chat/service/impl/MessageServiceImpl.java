package com.tysa.masquechat.chat.service.impl;

import com.tysa.masquechat.chat.repo.MessageRepository;
import com.tysa.masquechat.chat.service.MessageService;

public class MessageServiceImpl implements MessageService {
    private final MessageRepository messageRepository;
    public MessageServiceImpl(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }
}
