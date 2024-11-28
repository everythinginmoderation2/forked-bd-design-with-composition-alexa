package com.amazon.ata.designcomposition;

import java.util.ArrayList;
import java.util.List;

public class ReadOnlyAlexaQAClient {
    private final AlexaQAClient client;

    public ReadOnlyAlexaQAClient (AlexaQAClient client) {
        this.client = client;
    }


    public List<AlexaAnswer> findAnswers(AlexaQuestion question) {
        return client.findAnswers(question);
    }

}
