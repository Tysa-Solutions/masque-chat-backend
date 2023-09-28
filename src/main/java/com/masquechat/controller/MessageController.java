package com.masquechat.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = "/api/v1/messages", produces = APPLICATION_JSON_VALUE)
public class MessageController {
//public class MessageController extends AbstractCRUDController<MessageDto, MessageService> {
}
