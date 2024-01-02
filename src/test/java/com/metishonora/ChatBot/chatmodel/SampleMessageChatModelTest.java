package com.metishonora.ChatBot.chatmodel;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class SampleMessageChatModelTest {
    private static final String SAMPLE_MESSAGE = "This is a sample message.";
    private final ChatModel api = new SampleMessageChatModel();

    @ParameterizedTest
    @ValueSource(strings = {"abc", "12345", "가나다라마바사"})
    void getResponse(String input) {
        String response = api.getResponse(input);
        Assertions.assertThat(response).isEqualTo(SAMPLE_MESSAGE);
    }
}