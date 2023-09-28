package com.masquechat.service.impl;

import com.masquechat.repo.MessageRepository;
import com.masquechat.service.MessageService;

public class MessageServiceImpl implements MessageService {
    private final MessageRepository messageRepository;
    public MessageServiceImpl(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }
}
