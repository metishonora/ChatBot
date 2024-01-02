package com.metishonora.ChatBot.chatmodel;

public class SampleMessageChatModel implements ChatModel {
    @Override
    public String getResponse(String userInput) {
        return "This is a sample message.";
    }
}
